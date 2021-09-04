package ru.sbtqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.alfatest.cucumber.annotations.Name;
import ru.sbtqa.alfatest.cucumber.annotations.Optional;
import ru.sbtqa.alfatest.cucumber.api.AkitaPage;

@Name("Страница входа Mail.ru")
public class MailMainPage extends AkitaPage {

    @FindBy(xpath = "//input[@name='login']")
    @Name("Логин")
    public SelenideElement formLogon;

    @FindBy(xpath = "//button[contains(@data-testid,'enter-password')]")
    @Name("Ввести пароль")
    public SelenideElement buttonPassword;

    @Optional
    @FindBy(xpath = "//input[@type='password']")
    @Name("Пароль")
    public SelenideElement formPassword;

    @Optional
    @FindBy(xpath = "//button[@data-testid='login-to-mail']")
    @Name("Войти")
    public SelenideElement buttonIn;
}

