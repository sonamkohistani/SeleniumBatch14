package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        //print the animals on screen and then select baby cat from the drop down
        driver.manage().window().maximize();
        driver.switchTo().frame(1);
        //find the text animals and print on screen
       WebElement animalText= driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abracadabra");

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
      //find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        WebElement checkbox=driver.findElement(By.xpath("//select[@id='animals']"));
        checkbox.click();

    }
}
