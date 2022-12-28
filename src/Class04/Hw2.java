package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    /*HRMS Application Negative Login:Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username Leave password field empty Click on login button
    Verify error message with text “Password cannot be empty” is displayed.
    Hint:you can use if else condition for verification of message*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        WebElement textBox=driver.findElement(By.cssSelector("input[name*='txtUsername']"));
        textBox.sendKeys("Admin");

        WebElement logButton=driver.findElement(By.cssSelector("input#btnLogin"));
        logButton.click();

        WebElement text=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        String displaly=text.getText();
        boolean displaystatus=text.isDisplayed();
        if (displaystatus) {
            System.out.println("Password cannot be empty: "+displaystatus);
        }else {
            System.out.println("Password cannot be empty: "+ displaystatus);
        }



    }
}
