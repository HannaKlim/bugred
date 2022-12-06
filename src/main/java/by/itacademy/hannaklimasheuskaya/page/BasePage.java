package by.itacademy.hannaklimasheuskaya.page;

import by.itacademy.hannaklimasheuskaya.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;
    private static final String URL = "http://users.bugred.ru/user/login/index.html";
    public BasePage() {
        this.driver = Driver.getDriver();
    }
    public void openPage() {
        driver.navigate().to(URL);
    }
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }
    public void inputTextToForm(By byLocator, String text){
        WebElement webElementInputText = driver.findElement(byLocator);
        webElementInputText.sendKeys(text);
    }
    public String getText(By byLocator){
        WebElement webElementGetText = driver.findElement(byLocator);
        return webElementGetText.getText();
    }
}
