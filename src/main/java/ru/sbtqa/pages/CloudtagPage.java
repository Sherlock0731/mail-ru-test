package ru.sbtqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.alfatest.cucumber.annotations.Name;
import ru.sbtqa.alfatest.cucumber.annotations.Optional;
import ru.sbtqa.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Облако Тегов")
public class CloudtagPage extends AkitaPage {

    // Титул
    @FindBy(xpath = "//span[text()='Актуальное']")
    @Name("Актуальное")
    public SelenideElement titleActual;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Обновить')]")
    @Name("Обновить")
    public SelenideElement buttonUpdate;

    //TODO Убрать из локаторов классы
    @FindBy(xpath = "(//div[@class='Cloud_icon__27Jlw'])[1]")
    @Name("Настройки Облака")
    public SelenideElement buttonSettings;

    @FindBy(xpath = "(//div[@class='Cloud_icon__27Jlw'])[2]")
    @Name("Поиск диалогов")
    public SelenideElement buttonDialogues;

    @FindBy(xpath = "(//div[@class='SideBarButton_container__KWWf-'])[2]")
    @Name("Выйти")
    public SelenideElement buttonLogoff;

    @FindBy(css = ".SideBarButton_active__pzPk7 > svg")
    @Name("Вкладка Облако")
    public SelenideElement tabCloudTag;

    @FindBy(xpath = "//p[contains(@class,'Cloud_text__j9tPD')]")
    @Name("Облако сформировано за период")
    public SelenideElement textDate;

    @Optional
    @FindBy(xpath = "//p[@class='Tag_tag__text__2IOY4']")
    @Name("Тег")
    public SelenideElement textTag;

    @Optional
    @FindBy(xpath = "//div[@class='TagCloudCustom_cloud__1KLzx']")
    @Name("Облако")
    public List<SelenideElement> listCloudTag;

    @Optional
    @FindBy(xpath = "//p[contains(@class,'3t4Qq')]")
    @Name("В данный момент, тегов с соответствующими настройками не обнаружено")
    public SelenideElement textTagsNotFound;

    @Optional
    @FindBy(xpath = "//p[@class='Cloud_count_dialogs__1kuGh']")
    @Name("Количество инцидентных диалогов")
    public SelenideElement textIncidentCount;

    @Optional
    @FindBy(xpath = "//span[contains(@class,'24fr7')]")
    @Name("Вероятность инцидента")
    public SelenideElement textIncidentProbability;

    @Optional
    @FindBy(xpath = "//p[@class='Cloud_product__1bdGB']")
    @Name("Топ ицидентный продукт")
    public SelenideElement textTopIncidentProduct;

    @Optional
    @FindBy(xpath = "//div[@class='DialogList_header__3Rglq']")
    @Name("Титул списка диалогов")
    public SelenideElement titleDialogueList;

    @Optional
    @FindBy(xpath = "//*[@class='DialogList_row__wrapper__1dF0x']")
    @Name("Список диалогов")
    public SelenideElement elementDialogueList;

    //TODO Переделать локатор в список когда биграмы переедут в сигму
    @Optional
    @FindBy(xpath = "//div[@class='StickyLoader_children_wrapper__1wUMO']")
    @Name("Список биграм")
    public SelenideElement listBigrams;

    @Optional
    @FindBy(xpath = "//div[@class='Popover_icon__2RZl_']")
    @Name("Иконка биграмы")
    public SelenideElement iconBigram;
}
