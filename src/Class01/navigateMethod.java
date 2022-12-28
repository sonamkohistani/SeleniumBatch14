package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");

        driver.get("https://www.facebook.com/");
        //introduce some sleep which is wait
        //wait or pause for 2000 milli seconds (2 sec)
        Thread.sleep(2000);
       // go back to google
        driver.navigate().back();
        //go back to fa.com
        driver.navigate().forward();
        //wait for 1 sec
        Thread.sleep(1000);
        //refresh the page
        driver.navigate().refresh();
        //quit
        driver.quit();
    }
}
