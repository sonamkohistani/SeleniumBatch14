package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw2 {
    /* HW2
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://www.ebay.com/");
//        maximize
        driver.manage().window().maximize();
        WebElement categories=driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select OPtions=new Select(categories);
       // List<WebElement>options=

    }
}
