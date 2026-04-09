import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTestYahooYandex() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("yandex").pressEnter();
        $("[id=results]").shouldHave(text("yandex"));
    }
    @Test
    void successfulSearchTestYahooGradle() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("gradle").pressEnter();
        $("[id=results]").shouldHave(text("gradle"));
    }
    @Test
    void successfulSearchTestYahooAppolo() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("appolo").pressEnter();
        $("[id=results]").shouldHave(text("appolo"));
    }
    @Test
    void successfulSearchTestYahooStoloto() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("Stoloto").pressEnter();
        $("[id=results]").shouldHave(text("Stoloto"));
    }
}
