package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        //goto https://chercher.tech/practice/frames
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();
        //Task2:--Select BabyCat from drop dwon
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='animals']"));
        dropdown.click();
        Select select= new Select(dropdown);
        select.selectByValue("babycat");
        //Task3:-- Send text in text box "DONE"
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement txt=driver.findElement(By.xpath("//input"));
        txt.sendKeys("DONE");

    }
}
/*

//        switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
//        switch the focus to the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

//        switch the focus back to home content
          driver.switchTo().defaultContent();

//          switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

//        find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(dropDown);

        sel.selectByIndex(1);
            driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");

        driver.findElement(By.xpath("//input")).sendKeys("abracdabra");
 */
