package by.itacademy.hannaklimasheuskaya.ui;

import by.itacademy.hannaklimasheuskaya.driver.Driver;
import by.itacademy.hannaklimasheuskaya.page.BasePage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTestUi {
    @BeforeEach
    public void setWebDriver() {
        BasePage page = new BasePage();
        page.openPage();
    }

    @AfterEach
    public void closeWebDiver() {
        Driver.closeDriver();
    }
}

