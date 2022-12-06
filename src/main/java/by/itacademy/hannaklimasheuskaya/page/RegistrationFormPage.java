package by.itacademy.hannaklimasheuskaya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationFormPage extends BasePage {
    private final By byTextHeaderOfRegistrationForm = By.xpath("//div[2]/h2");
    private final By byTextFormOfNameLocator = By.xpath("//div[2]/form/table/tbody/tr[1]/td[1]");
    private final By byTextFormOfEmailLocator = By.xpath("//div[2]/form/table/tbody/tr[2]/td[1]");
    private final By byTextFormOfPasswordLocator = By.xpath("//div[2]/form/table/tbody/tr[3]/td[1]");
    private final By byRegistrationButton = By.xpath("//div[2]/form/table/tbody/tr[4]/td[2]/input");

    private final By byInputName = By.xpath("//div[2]/form/table/tbody/tr[1]/td[2]/input");
    private final By byInputEmail = By.xpath("//div[2]/form/table/tbody/tr[2]/td[2]/input");
    private final By byInputPassword = By.xpath("//div[2]/form/table/tbody/tr[3]/td[2]/input");
    private final By byErrorMessageLocator = By.xpath("//div[3]/div[1]/div[2]/form/p");
    private final By byRegisteredUserNameLocator = By.xpath("//*[@id=\"fat-menu\"]/a");

    public static final String HEADER_OF_REGISTRATION_FORM = "Регистрация";
    public static final String REGISTRATION_NAME_FIELD = "Имя";
    public static final String REGISTRATION_EMAIL_FIELD = "Email";
    public static final String REGISTRATION_PASSWORD_FIELD = "Пароль";
    public static final String NAME_REGISTRATION_BUTTON = "Зарегистрироваться";
    private static final String ERROR_EMAIL_MESSAGE = "Неправильное значение поля (email)";
    private static final String ERROR_NAME_MESSAGE = "Занят (name)";

    public RegistrationFormPage() {
        super();
    }

    public String getTextFromHeaderOfRegistrationForm() {
        return getText(byTextHeaderOfRegistrationForm);
    }

    public String getTextFromFormOfNameLocator() {
        return getText(byTextFormOfNameLocator);
    }

    public String getTextFromFormOfEmailLocator() {
        return getText(byTextFormOfEmailLocator);
    }

    public String getTextFromFormOfPasswordLocator() {
        return getText(byTextFormOfPasswordLocator);
    }

    public String getTextFromRegistrationButton() {
        return getText(byRegistrationButton);
    }

    public String getTextFromRegisteredUserNameLocator() {
        return getText(byRegisteredUserNameLocator);
    }

    public String getTextFromErrorMessageLocator() {
        return getText(byErrorMessageLocator);
    }

    public void typeInputName(String name) {
        inputTextToForm(byInputName, name);
    }

    public void typeInputEmail(String email) {
        inputTextToForm(byInputEmail, email);
    }

    public void typeInputPassword(String password) {
        inputTextToForm(byInputPassword, password);
    }

    public void clickRegistrationButton() {
        clickElement(byRegistrationButton);
    }

}
