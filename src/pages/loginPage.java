package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlies.CommonMethods;

import static utlies.CommonMethods.driver;

public class loginPage extends CommonMethods {
    public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));
    public WebElement LoginSign = driver.findElement(By.xpath(" //div[text()='LOGIN Panel']"));
}
