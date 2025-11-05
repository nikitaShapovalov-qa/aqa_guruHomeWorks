import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@Tag("simple")
public class homeWork2_1 {

    @Test
    void findElementGithub3() {

        //открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //перенести блок A вправо
        actions().moveToElement($("#column-a"))
                .clickAndHold().moveByOffset(150, 0).release().perform();

        //проверить, что блок A теперь находится на месте блока B
        $("#column-b").shouldHave(text("A"));

        sleep(1000);

        //проверка переноса по другому методу
        $("#column-a").dragAndDropTo($("#column-b"));

        //проверка, что все вернулось на свои места
        $("#column-a").shouldHave(text("A"));

        sleep(1000);

    }
}
