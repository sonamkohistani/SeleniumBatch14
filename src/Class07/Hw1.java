package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw1 {
    public static void main(String[] args) {
        /***HomeWork 1**
         **WindowHandles**
         Hint1:
         u can save the window handle in variables for later use*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        //1.goto http://accounts.google.com/signup
        driver.get("http://accounts.google.com/signup");
        // 2.click on help and privacy btn
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privcyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privcyBtn.click();
        String gmail = driver.getWindowHandle();
        Set<String> allwindoHandles = driver.getWindowHandles();
         for (String handle:allwindoHandles){
             driver.switchTo().window(handle);
             String title= driver.getTitle();
             if(title.equalsIgnoreCase("Google Account Help")){
                 System.out.println(title);
                 break;}}
        // 3.click on community Button
        WebElement communityBtn=driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        driver.switchTo().window(gmail);//in order to avoid loop and use handle letter we store it in a variable
        // 4.goto gmail.com page and enter your user name in form Create your Google Account
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("sonamkohistani");


    }
}
