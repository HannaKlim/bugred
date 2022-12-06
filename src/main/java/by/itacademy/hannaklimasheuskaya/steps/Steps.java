package by.itacademy.hannaklimasheuskaya.steps;

import by.itacademy.hannaklimasheuskaya.page.AuthorizationFormPage;
import by.itacademy.hannaklimasheuskaya.page.RegistrationFormPage;

public class Steps {
    public void usersRegistration(String name, String email, String password) {
        RegistrationFormPage registrationPage = new RegistrationFormPage();
        registrationPage.typeInputName(name);
        registrationPage.typeInputEmail(email);
        registrationPage.typeInputPassword(password);
        registrationPage.clickRegistrationButton();
    }
    public void userAuthorization(String email, String password){
        AuthorizationFormPage authorizationPage = new AuthorizationFormPage();
        authorizationPage.typeInputEmail(email);
        authorizationPage.typeInputPassword(password);
        authorizationPage.clickAuthorizationButton();
    }

}
