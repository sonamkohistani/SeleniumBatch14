package Class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBroser {

    public static void main(String[]args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a Webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get()function to open up the required website
        driver.get("http://www.google.com/");
        //get the url of the website
        String url =driver.getCurrentUrl();
        //print the  url
        System.out.println(url);
        // get the tittle
        String title=driver.getTitle();
        //print the  title
        System.out.println(title);
        //close the chrome
        driver.quit();

    }

}

