import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@Tag("simple")
public class homeWork1 {

    @Test
    void findElementGithubCss() {

        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");

        //перейти на вкладку вики
        $("#wiki-tab").click();

        //проверка, что открылась страница вики
        $(".heading-element").shouldHave(text("Welcome to the selenide wiki!"));
        //клик на кнопку Show 3 more pages
        $("#wiki-pages-box li button").click();
        //клик на SoftAssertions
        $$(".wiki-pages-box li a").findBy(text("SoftAssertions")).click();

        //проверить, что есть пример кода на JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5"));

    }
}