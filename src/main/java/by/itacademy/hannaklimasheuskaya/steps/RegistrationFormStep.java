package by.itacademy.hannaklimasheuskaya.steps;

import by.itacademy.hannaklimasheuskaya.page.RegistrationFormPage;

public class RegistrationFormStep extends RegistrationFormPage {

    public void usersRegistration(String name, String email, String password) {
        typeInputName(name);
        typeInputEmail(email);
        typeInputPassword(password);
        clickRegistrationButton();
    }

}
