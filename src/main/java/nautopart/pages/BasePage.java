package nautopart.pages;

import nautopart.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver = DriverSingleton.getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

}