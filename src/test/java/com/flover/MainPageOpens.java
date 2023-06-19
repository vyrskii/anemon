package com.flover;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageOpens {

    @Test
    void mainPageOpens() {
        open("https://xn--80akvccf.xn--p1ai/");
        $(".header-email").shouldHave(text("anemonsar2@gmail.com"));
    }
}
