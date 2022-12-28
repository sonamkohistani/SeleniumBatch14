package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw {
      //Go to syntax hrms . Go-to the recruitment tab.From the calendar  just select a date 8 August 2023
        public static void main(String[]args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
            driver.manage().window().maximize();
            //  go to the website
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%C3%A2%C2%80%C2%9D");

            WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("admin");
            WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            pass.sendKeys("Hum@nhrm123");
            WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginBtn.click();
            WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
            recruitmentBtn.click();
            WebElement calendar=driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
            calendar.click();
            WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select sel=new Select(month);
            sel.selectByVisibleText("Aug");
            WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select sel1=new Select(year);
            sel1.selectByVisibleText("2023");
            List<WebElement> day = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
           // List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
          /*  for (WebElement day:days){
                String text=day.getText();
                if (text.equalsIgnoreCase("8")){
                    day.click();
                }
            }*/
        }
}
