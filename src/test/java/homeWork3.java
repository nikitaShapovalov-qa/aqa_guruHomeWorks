import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v85.page.Page;
import pages.PageForm;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class homeWork3 {

    PageForm pageForm = new PageForm();

    @BeforeAll
    static void predy() {

        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void demo_qa_test() {

        open("/automation-practice-form");

        pageForm.pageIsOpen();

        pageForm.setFirstName("Daniil");
        pageForm.setLastName("Konovalov");
        pageForm.setUserEmail("konoval58rus@mail.ru");
        pageForm.setGender("Other");
        pageForm.setUserNumber("89128525252");

        pageForm.setDateOfBirth("0", "1952", "Choose Tuesday, January 1st, 1952");

        pageForm.setSubjects("Computer Science");
        pageForm.setHobbies("Sports");
        pageForm.setCurrentAddress("Steam", "CS2");
        pageForm.setState("NCR");
        pageForm.setCity("Gurgaon");

        pageForm.clickSubmit();
        pageForm.setModalIsOpen("Thanks for submitting the form");

    }
} 