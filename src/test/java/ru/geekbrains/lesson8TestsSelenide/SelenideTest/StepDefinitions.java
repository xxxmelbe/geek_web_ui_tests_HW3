package ru.geekbrains.lesson8TestsSelenide.SelenideTest;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.close;


@RunWith(Cucumber.class)

public class StepDefinitions {
    @After
    public void af(){
        close();
    }

}
