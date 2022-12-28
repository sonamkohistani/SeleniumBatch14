package reviewclass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


     System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    //create a webDriver istance
    WebDriver driver=new ChromeDriver();
    //1.goto http://accounts.google.com/signup
        driver.get("https://demoqa.com/alerts");
        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        Thread.sleep(2000);
//     alert interface
        Alert Alert1 = driver.switchTo().alert();
        Alert1.accept();


//     alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();


//   reusing the alert already declared
        Alert1.sendKeys("abracadbra");
        Alert1.accept();

    }}
