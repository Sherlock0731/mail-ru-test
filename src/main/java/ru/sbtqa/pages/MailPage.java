package ru.sbtqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.alfatest.cucumber.annotations.Name;
import ru.sbtqa.alfatest.cucumber.api.AkitaPage;

@Name("Почтовый ящик")
public class MailPage extends AkitaPage {

    @FindBy(xpath = "//a[contains(@class,'current')]")
    @Name("Почта")
    public SelenideElement imageLogo;

    @FindBy(xpath = "//img[contains(@class,'ph-avatar-img svelte-dfhuqc')]")
    @Name("Аватар")
    public SelenideElement imageAvatar;

    @FindBy(xpath = "//span[contains(@class,'filter-text')]")
    @Name("Фильтр")
    public SelenideElement buttonFiltr;
}
