package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //goto syntaxproject.com
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadabara");
        //another method of doing the above operation
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("abracadabara");

        WebElement button=driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();
    }
}
