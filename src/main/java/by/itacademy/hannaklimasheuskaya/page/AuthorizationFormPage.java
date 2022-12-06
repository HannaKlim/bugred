package by.itacademy.hannaklimasheuskaya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthorizationFormPage extends BasePage{
    private final By byTextHeaderOfAuthorizationForm = By.xpath("//div[1]/h2");
    private final By byTextInstructionLocator = By.xpath("//div[3]/div[1]/div[1]/p");
    private final By byTextAuthorizationFormOfEmailLocator = By.xpath("//div[1]/form/table/tbody/tr[1]/td[1]");
    private final By byTextAuthorizationFormOfPasswordLocator = By.xpath("//div[1]/div[1]/form/table/tbody/tr[2]/td[1]");
    private final By byAuthorizationButton = By.xpath("//div[1]/form/table/tbody/tr[3]/td[2]/input");

    private final By byInputEmail = By.xpath("//div[1]/form/table/tbody/tr[1]/td[2]/input");
    private final By byInputPassword = By.xpath("//div[1]/form/table/tbody/tr[3]/td[2]/input");
    private final By byErrorMessageLocator = By.xpath("//div[3]/div[1]/div[2]/form/p");
    private final By byAuthorizedUserNameLocator = By.xpath("//*[@id=\"fat-menu\"]/a");

    public static final String HEADER_OF_AUTHORIZATION_FORM = "Авторизация";
    public static final String AUTHORIZATION_INSTRUCTION = "С помощью формы ниже,вы сможете авторизоваться на нашем ресурсе";
    public static final String AUTHORIZATION_EMAIL_FIELD = "Email";
    public static final String AUTHORIZATION_PASSWORD_FIELD = "Пароль";
    public static final String NAME_AUTHORIZATION_BUTTON = "Авторизоваться";
    private static final String ERROR_EMAIL_MESSAGE = "Неправильное значение поля (email)";
    private static final String ERROR_NAME_MESSAGE = "Занят (name)";

    public AuthorizationFormPage() {
        super();
    }

    public String getTextFromHeaderOfAuthorizationForm() {
        return getText(byTextHeaderOfAuthorizationForm);
    }

    public String getTextFromFormOfAuthorizationEmailLocator() {
        return getText(byTextAuthorizationFormOfEmailLocator);
    }

    public String getTextFromFormOfAuthorizationPasswordLocator() {
        return getText(byTextAuthorizationFormOfPasswordLocator);
    }

    public String getTextFromAuthorizationButton() {
        return getText(byAuthorizationButton);
    }

    public String getTextFromAuthorizedUserNameLocator() {
        return getText(byAuthorizedUserNameLocator);
    }

    public String getTextFromErrorMessageLocator() {
        return getText(byErrorMessageLocator);
    }

    public void typeInputEmail(String email) {
        inputTextToForm(byInputEmail, email);
    }

    public void typeInputPassword(String password) {
        inputTextToForm(byInputPassword, password);
    }

    public void clickAuthorizationButton() {
        clickElement(byAuthorizationButton);
    }

}
