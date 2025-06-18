import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class homeWork2 {

    @Test
    void findElementGithub2() {

        //открыть главную страницу гитхаба
        open("https://github.com/");

        //навести курсор на селект Solutions
        $$(".HeaderMenu-nav ul li button").findBy(text("Solutions")).hover();

        //кликнуть на Enterprises
        $$(".HeaderMenu-dropdown div div ul li").findBy(text("Enterprises"))
                .click();

        //проверить наличие заголовка на странице Enterprises
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));

    }
}
