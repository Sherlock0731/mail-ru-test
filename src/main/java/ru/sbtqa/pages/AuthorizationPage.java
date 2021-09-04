package ru.sbtqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.alfatest.cucumber.annotations.Name;
import ru.sbtqa.alfatest.cucumber.annotations.Optional;
import ru.sbtqa.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Авторизация приложения")
public class AuthorizationPage extends AkitaPage {

    @FindBy(xpath = "//div[text()='Вход']")
    @Name("Вход")
    public SelenideElement titleEntrance;

    @FindBy(xpath = "//div[text()='Домен']")
    @Name("Домен")
    public SelenideElement textDomain;

    @FindBy(css = ".CustomSelect_placeholder__GMfga")
    @Name("Список доменов")
    public SelenideElement dropDownDomain;

    //TODO Убрать из локаторов классы
    @FindBy(xpath = "//li[@class='CustomSelect_item__1hoSi']")
    @Name("Выберите домен")
    public List<SelenideElement> listDomain;

    @FindBy(xpath = "//div[text()='Логин']")
    @Name("Логин")
    public SelenideElement textLogin;

    @FindBy(xpath = "//input[@placeholder='Введите логин']")
    @Name("Введите логин")
    public SelenideElement formLogon;

    @FindBy(xpath = "//div[text()='Пароль']")
    @Name("Пароль")
    public SelenideElement textPassword;

    @FindBy(xpath = "//input[@placeholder='Введите пароль']")
    @Name("Введите пароль")
    public SelenideElement formPassword;

    @FindBy(xpath = "//div[@class='SignIn_form__error__14Wb6']/following-sibling::div[1]")
    @Name("Войти(неактивная)")
    public SelenideElement buttonInInactive;

    @Optional
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Войти')]")
    @Name("Войти(активная)")
    public SelenideElement buttonInActive;

    @Optional
    @FindBy(xpath = "//div[text()='Неверный логин или пароль']")
    @Name("Неверный логин или пароль")
    public SelenideElement errorAuthorization;

    @Optional
    @FindBy(xpath = "(//span[text()='Выберите домен'])[2]")
    @Name("Неверный домен")
    public SelenideElement errorDomain;

    @Optional
    @FindBy(xpath = "//div[text()='Введите логин']")
    @Name("Неверный логин")
    public SelenideElement errorLogin;

    @Optional
    @FindBy(xpath = "//div[text()='Введите пароль']")
    @Name("Неверный пароль")
    public SelenideElement errorPassword;
}