package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw3 {
    public static void main(String[] args) {
         /*
        HomeWork3: (do not use thread .sleep  or Explicit wait)
        write down  whatever the reason you understand  of text being empty after exploring DOM
        Syntax - Website to practice Syntax Automation Platform
        Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web applications around the world.
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get(" https://syntaxprojects.com/dynamic-elements-loading.php");
        //2.Click on start button
        WebElement statBtn=driver.findElement(By.id("startButton"));
        statBtn.click();
        //3.get the text Welcome Syntax technologies and print on console the text will be Empty
        WebElement welcomeText=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcomeText.getText();
        System.out.println("The text is Empty:"+text);
        /*The reason that the text is empty in console because there is no synchroniztion between DOM and UI.if the text
         was found in DOM it was not display in the UI.


         */


    }
}
