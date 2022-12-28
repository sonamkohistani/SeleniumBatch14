package class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //goto https://demo.guru99.com/test/simple_context_menu.html
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //right click  on the button,
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        //select edit
        WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
        edit.click();
        //handle the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //double click on the button
        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleClick).perform();
        //handle the alert
        driver.switchTo().alert();
        alert.accept();



        }
    }
