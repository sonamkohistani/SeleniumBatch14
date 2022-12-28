package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW1Parabank {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("sonam");
        driver.findElement(By.id("customer.lastName")).sendKeys("kohistani");
        driver.findElement(By.id("customer.address.street")).sendKeys("200 yoakum park way");
        driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22334");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0563728355");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-23-3542");
        driver.findElement(By.id("customer.username")).sendKeys("sonam123");
        driver.findElement(By.id("customer.password")).sendKeys("abcd123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abcd123");
        driver.findElement(By.className("button")).click();
        //driver.quit();

    }
}
