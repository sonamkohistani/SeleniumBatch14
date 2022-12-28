package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        driver.manage().window().maximize();
        List<WebElement>checkBoxes =driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox:checkBoxes){
           String optionName=  checkBox.getAttribute("value");
           if (optionName.equalsIgnoreCase("Option-3")){
               checkBox.click();
           }
        }
    }
}
