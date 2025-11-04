import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import pages.PageForm;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.attachment;

public class homeWork2 {

    PageForm pageForm = new PageForm();

    @Test
    public void findElementGithub2() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        //открыть главную страницу гитхаба
        open("https://github.com/");
        //attachment("Source", webdriver().driver().source());

        //навести курсор на селект Solutions
        $$(".HeaderMenu-nav ul li button").findBy(text("Solutions")).hover();

        //кликнуть на Enterprises
        $$(".HeaderMenu-dropdown div div ul li").findBy(text("Enterprises"))
                .click();

        //проверить наличие заголовка на странице Enterprises
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));

        pageForm.takeScreenshot();
    }
}
