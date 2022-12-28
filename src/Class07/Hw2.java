package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*
        **HomeWork 2**
       *Implicit wait**
         */
        //1.goto https://syntaxprojects.com/dynamic-data-loading-demo.php
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        //2. click on get New User
        WebElement getNewUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUser.click();
       // 3. get the firstname  of user and print it on console
        WebElement Text=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = Text.getText();
        System.out.println("The first name is :"+text);
    }
}
