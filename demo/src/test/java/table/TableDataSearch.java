package table;


import inputforms.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableDataSearch extends BaseClass {

    @Test
    public void tasks() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Table Data Search']")).click();
        Thread.sleep(2000);

       // driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Wireframes");

        String actTask = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals("Wireframes", actTask);

        String actAssignee = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals("John Smith", actAssignee);

        String actStatus = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals("in progress", actStatus);

        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Landing Page");

        String actTask1 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals("Landing Page", actTask1);

        String actAssignee1 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals("Mike Trout", actAssignee1);

        String actStatus1 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals("completed", actStatus1);

        closeWebSite(driver);

    }
}
