import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class homeWork3 {

    @BeforeAll
    static void predy() {

        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void demo_qa_test() {

        open("/automation-practice-form");

        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Daniil");
        $("#lastName").setValue("Konoval");
        $("#userEmail").setValue("pig58@mail.ru");
        $x("//div[@id='genterWrapper']").$(byText("Other")).click();
        //$x("//label[@class='custom-control-label' and contains(text(), 'Other')]").click();
        $("#userNumber").setValue("9528125252");
        $("#dateOfBirthInput").click();
        $x("//select[@class='react-datepicker__month-select']//option[@value='0']").click();
        $x("//select[@class='react-datepicker__year-select']//option[@value='1952']").click();
        $x("//div[@aria-label='Choose Tuesday, January 1st, 1952']").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $x("//div[@id='hobbiesWrapper']").$(byText("Sports")).click();
        //$x("//label[@class='custom-control-label' and contains(text(), 'Sports')]").click();
        File file = new File("/Users/nikitashapovalov/IdeaProjects/aqa_guruHomeWorks/src" +
                "/test/resources/Снимок экрана 2025-05-20 в 22.35.29.png");
        $x("//div[@class='form-file']//input[@id='uploadPicture']").uploadFile(file);
        $("#currentAddress").setValue("Steam, CS2");
        $x("//div[@id='state']").click();
        $x("//div[contains(text(), 'NCR')]").click();
        $("#city").click();
        $x("//div[contains(text(), 'Gurgaon')]").click();

        $("#submit").click();
        $x("//div[@id='example-modal-sizes-title-lg']")
                .shouldHave(text("Thanks for submitting the form"));
    }
} 