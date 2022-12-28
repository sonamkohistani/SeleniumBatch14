package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandlingAdvance {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
//      open gmail.com signup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privcy button
        WebElement privcyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privcyBtn.click();
        //get all the windo handles
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle:allHandles){
            //switchin the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to which the driver has switch
            String title=driver.getTitle();

            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is :"+title);
                break;

            }
        }

        WebElement communityBtn=driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
}}
