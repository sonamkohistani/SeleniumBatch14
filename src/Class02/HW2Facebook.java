package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Facebook{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("sonam");
        driver.findElement(By.name("lastname")).sendKeys("kohistani");
        driver.findElement(By.name("reg_email__")).sendKeys("sonamk@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sonamk@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("abdcd1234");
        driver.findElement(By.id("month")).sendKeys("Jun");
        driver.findElement(By.id("day")).sendKeys("22");
        driver.findElement(By.id("year")).sendKeys("1991");
        driver.findElement(By.name("sex")).sendKeys("Female");
        driver.quit();
        Thread.sleep(3000);

    }
}
