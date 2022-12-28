package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class XpathHw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.findElement(By.xpath("//a[contains(@id,'btn_basic')]")).click();
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//a[contains(@class,'list-group-item')]")).click();
        driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

        driver.findElement(By.xpath("//input[starts-with(@class,'form')]")).click();
        driver.findElement(By.xpath("//button[contains(@type,'but')]")).click();
        Thread.sleep(3000);
        //driver.quit();

    }
}
