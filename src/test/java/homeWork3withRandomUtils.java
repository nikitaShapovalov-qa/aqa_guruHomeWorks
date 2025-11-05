import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PageForm;

import static Utils.RandomUtils.randomEmail;
import static Utils.RandomUtils.randomString;
import static com.codeborne.selenide.Selenide.*;

@Tag("simple")
public class homeWork3withRandomUtils {

    PageForm pageForm = new PageForm();

    @BeforeAll
    static void predy() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void demo_qa_test() {
        String firstName = randomString(5);
        String lastName = randomString(10);
        String userEmail = randomEmail();

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
        pageForm.setCurrentAddress("Steam");
        pageForm.setState("NCR");
        pageForm.setCity("Gurgaon");

        pageForm.clickSubmit();
        pageForm.setModalIsOpen("Thanks for submitting the form");
    }
} 