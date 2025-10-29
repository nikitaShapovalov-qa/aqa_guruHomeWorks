package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.TakeScreenshot;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class PageForm {

    private final SelenideElement practiceForm = $(".practice-form-wrapper"),
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            gender = $x("//div[@id='genterWrapper']"),
            userNumber = $("#userNumber"),
            dateOfBirth = $("#dateOfBirthInput"),
            month = $x("//select[@class='react-datepicker__month-select']//option[@value='0']"),
            year = $x("//select[@class='react-datepicker__year-select']//option[@value='1952']"),
            day = $x("//div[@aria-label='Choose Tuesday, January 1st, 1952']"),
            subjects = $("#subjectsInput"),
            hobbies = $x("//div[@id='hobbiesWrapper']"),
            uploadFile = $x("//div[@class='form-file']//input[@id='uploadPicture']"),
            currentAddress = $("#currentAddress"),
            state = $x("//div[@id='state']"),
            city = $("#city"),
            buttonSubmit = $("#submit"),
            modalIsOpen = $x("//div[@id='example-modal-sizes-title-lg']");

    @Step("Проверить, что страница Practice Form открыта")
    public void pageIsOpen() {
        this.practiceForm.shouldHave(text("Student Registration Form"))
                .shouldBe(visible);
    }

    @Step("Написать имя")
    public void setFirstName(String value) {
        this.firstName.setValue(value).click();
    }

    @Step("Написать фамилию")
    public void setLastName(String value) {
        this.lastName.setValue(value).click();
    }

    @Step("Написать почту")
    public void setUserEmail(String value) {
        this.userEmail.setValue(value).click();
    }

    @Step("Выбрать пол")
    public void setGender(String value) {
        this.gender.$(byText((value))).click();
    }

    @Step("Написать телефон")
    public void setUserNumber(String value) {
        this.userNumber.setValue(value).click();
    }

    @Step("Написать дату рождения")
    public void setDateOfBirthDefault() {
        this.dateOfBirth.click();
        $x("//select[@class='react-datepicker__month-select']//option[@value='0']").click();
        $x("//select[@class='react-datepicker__year-select']//option[@value='1952']").click();
        $x("//div[@aria-label='Choose Tuesday, January 1st, 1952']").click();
    }

    @Step("Написать дату рождения")
    public void setDateOfBirth(String month, String year, String day) {
        this.dateOfBirth.click();
        $x("//select[@class='react-datepicker__month-select']//option[@value='" + month + "']").click();
        $x("//select[@class='react-datepicker__year-select']//option[@value='" + year + "']").click();
        $x("//div[@aria-label='" + day + "']").click();
    }

    @Step("Нажать на поле 'Date of birth'")
    public void clickDateOfBirth() {
        this.dateOfBirth.click();
    }

    @Step("Выбрать месяц")
    public void setMonth(String value) {
        this.dateOfBirth.click();
        $x("//select[@class='react-datepicker__month-select']//option[@value='"+ value +"']").click();
    }

    @Step("Выбрать год")
    public void setYear(String value) {
        this.dateOfBirth.click();
        $x("//select[@class='react-datepicker__year-select']//option[@value='"+ value +"']").click();
    }

    @Step("Выбрать день")
    public void setDay(String value) {
        this.dateOfBirth.click();
        $x("//div[@aria-label='"+ value + "']").click();
    }

    @Step("Выбрать предмет")
    public void setSubjects(String value) {
        this.subjects.setValue(value).pressEnter();
    }

    @Step("Выбрать хобби")
    public void setHobbies(String value) {
        this.hobbies.$(byText(value)).click();
    }

    @Step("Загрузить файл")
    public void setUploadFile() {
        this.uploadFile.click();
        File file = new File("/Users/nikitashapovalov/IdeaProjects/aqa_guruHomeWorks/src" +
                "/test/resources/Снимок экрана 2025-05-20 в 22.35.29.png");
    }

    @Step("Выбрать предмет")
    public void setCurrentAddress(String value) {
        this.currentAddress.setValue(value).click();
    }

    @Step("Выбрать штат")
    public void setState(String value) {
        this.state.click();
        $x("//div[contains(text(), '" + value + "')]").click();
    }

    @Step("Выбрать город")
    public void setCity(String value) {
        this.city.click();
        $x("//div[contains(text(), '" + value + "')]").click();
    }

    @Step("Нажать Submit")
    public void clickSubmit() {
        this.buttonSubmit.click();
    }

    @Step("Проверить, что открылась таблица заполненная")
    public void setModalIsOpen(String value) {
        this.modalIsOpen.shouldHave(text(value)).shouldBe(exist);
    }

    @Attachment(value = "Скриншот", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
