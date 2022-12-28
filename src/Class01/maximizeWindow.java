package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {

         //goto google
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //goto google.com
        driver.get("http://www.google.com/");
        //maximize
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        //quit
        driver.quit();
    }
}
