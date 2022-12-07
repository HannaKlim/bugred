package by.itacademy.hannaklimasheuskaya.steps;

import by.itacademy.hannaklimasheuskaya.page.AuthorizationFormPage;

public class AuthorizationFormStep extends AuthorizationFormPage {

    public void userAuthorization(String email, String password){
        typeInputEmail(email);
        typeInputPassword(password);
        clickAuthorizationButton();
    }

}
