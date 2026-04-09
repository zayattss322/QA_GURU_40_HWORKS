import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTestYahoo() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("yandex").pressEnter();
        $("[id=results]").shouldHave(text("yandex"));
    }
}