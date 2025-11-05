import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

@Tag("simple")
public class homeWork1_1 {

    @Test
    void findElementGithubXpath() {

        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");

        //перейти на вкладку вики
        $x("//a[@id='wiki-tab']").click();

        //проверка, что открылась страница вики
        $x("//h1[@class='heading-element' and contains(text(), 'Welcome to the selenide wiki!')]");
        //клик на кнопку Show 3 more pages
        $x("//li[contains(@class, 'wiki-more-pages-link')]//button[contains(text(), 'Show 3 more pages')]").click();
        //клик на SoftAssertions
        $x("//span[./a[@href='/selenide/selenide/wiki/SoftAssertions']]").click();

        //проверить, что есть пример кода на JUnit5
        $x("//h4[@class='heading-element' and contains(text(), '3. Using JUnit5 extend test class:')]");

    }
}
