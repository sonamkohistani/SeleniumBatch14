package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hw1 {
    /*1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a webDriver istance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement acount=driver.findElement(By.partialLinkText("Create new account"));
        acount.click();
        Thread.sleep(3000);
       WebElement name= driver.findElement(By.name("firstname"));
       name.sendKeys("sonam");
       WebElement lname= driver.findElement(By.name("lastname"));
       lname.sendKeys("kohistani");
       WebElement email= driver.findElement(By.name("reg_email__"));
       email.sendKeys("sonamk@gmail.com");
       WebElement newpass=driver.findElement(By.name("reg_email_confirmation__"));
       newpass.sendKeys("sonamk@gmail.com");
       Thread.sleep(3000);
       WebElement repass=driver.findElement(By.name("reg_passwd__"));
       repass.sendKeys("abdcd1234");
       Thread.sleep(3000);
       WebElement month= driver.findElement(By.id("month"));
       month.sendKeys("Jun");
       Thread.sleep(3000);
       WebElement day= driver.findElement(By.id("day"));
       day.sendKeys("22");
       WebElement year=driver.findElement(By.id("year"));
       year.sendKeys("1991");
       WebElement gender= driver.findElement(By.name("sex"));
       gender.sendKeys("Female");
       // driver.quit();
        Thread.sleep(3000);


    }
}
