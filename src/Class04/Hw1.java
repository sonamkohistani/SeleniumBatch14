package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hw1 {
   /* Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify the message "Welcome Admin " is there on the top right corner*/
   public static void main(String[] args){
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
      // goto syntaxtechs.com
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
      // Enter username
       WebElement username=driver.findElement(By.cssSelector("input[name*='txtUsername']"));
       username.sendKeys("Admin");
       // Enter password
       WebElement password=driver.findElement(By.cssSelector("input[name*='txtPassword']"));
       password.sendKeys("Hum@nhrm123");
      //click on login button
       WebElement logbutton=driver.findElement(By.cssSelector("input#btnLogin"));
       logbutton.click();
       WebElement message=driver.findElement(By.cssSelector("a#welcome"));
       System.out.println("The message Welcome Admin there is on the top right corrner"+message);

   }
}
