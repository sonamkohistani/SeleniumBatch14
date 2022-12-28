package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class H {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize screen
        //driver.manage().window().maximize();
        //  Go to the website http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        driver.get(" http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //the user name is admin
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        //the password is Hum@nhrm123
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement logBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logBtn.click();
        //click on PIM
        WebElement PIM=driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();
        //click on Employee List
        WebElement Emp=driver.findElement(By.xpath("//a[text()='Employee List']"));
        Emp.click();
        //from the table choose one id (it must be from the first page)
        //and check the checkBox for that id (your logic should be dynamic  , should work for any ID number)
        List<WebElement> columId = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i=0;i<columId.size();i++){
            String text = columId.get(i).getText();
            if (text.equalsIgnoreCase("44969A")){
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i + 1)+"]/td[1]"));
                checkBox.click();


            }
        }





    }
}
