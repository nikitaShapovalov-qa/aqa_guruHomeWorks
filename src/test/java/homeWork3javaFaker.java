import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PageForm;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;

public class homeWork3javaFaker {

    PageForm pageForm = new PageForm();

    @BeforeAll
    static void predy() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void demo_qa_test() {
        Faker faker = new Faker(new Locale("ru"));

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String userEmail = faker.internet().emailAddress();
        String streetAddress = faker.address().streetAddress();

        open("/automation-practice-form");

        pageForm.pageIsOpen();

        pageForm.setFirstName(firstName);
        pageForm.setLastName(lastName);
        pageForm.setUserEmail(userEmail);
        pageForm.setGender("Other");
        pageForm.setUserNumber("89128525252");

        pageForm.setDateOfBirth("0", "1952", "Choose Tuesday, January 1st, 1952");

        pageForm.setSubjects("Computer Science");
        pageForm.setHobbies("Sports");
        pageForm.setCurrentAddress(streetAddress);
        pageForm.setState("NCR");
        pageForm.setCity("Gurgaon");

        pageForm.clickSubmit();
        pageForm.setModalIsOpen("Thanks for submitting the form");
    }
} 