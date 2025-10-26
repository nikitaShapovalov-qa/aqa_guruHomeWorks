import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PageForm;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;

public class homeWork3javaFaker {

    PageForm pageForm = new PageForm();
    TestData data = new TestData();

    @BeforeAll
    static void predy() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void demo_qa_test() {
        open("/automation-practice-form");

        pageForm.pageIsOpen();

        pageForm.setFirstName(data.firstName);
        pageForm.setLastName(data.lastName);
        pageForm.setUserEmail(data.userEmail);
        pageForm.setGender("Other");
        pageForm.setUserNumber("89128525252");

        pageForm.setDateOfBirth("0", "1952", "Choose Tuesday, January 1st, 1952");

        pageForm.setSubjects("Computer Science");
        pageForm.setHobbies("Sports");
        pageForm.setCurrentAddress(data.streetAddress);
        pageForm.setState("NCR");
        pageForm.setCity("Gurgaon");

        pageForm.clickSubmit();
        pageForm.setModalIsOpen("Thanks for submitting the form");
    }
} 