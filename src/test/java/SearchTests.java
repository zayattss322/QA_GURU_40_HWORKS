import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("selenide").pressEnter();
        $("[id=results]").shouldHave(text("selenide"));
    }
    @Test
    void successfulSearchTestRussia() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("russia").pressEnter();
        $("[id=results]").shouldHave(text("russia"));
    }
    @Test
    void successfulSearchTestBaobab() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("baobab").pressEnter();
        $("[id=results]").shouldHave(text("baobab"));
    }
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