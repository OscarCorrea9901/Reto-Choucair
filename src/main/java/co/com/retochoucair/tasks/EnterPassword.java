package co.com.retochoucair.tasks;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.userinterface.CheckPage;
import co.com.retochoucair.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class EnterPassword implements Task {
    private List<testData> data;

    public EnterPassword(List<testData> data) {
        this.data = data;
    }

    public static EnterPassword thePage(List<testData> data) {
        return Tasks.instrumented(EnterPassword.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getDataPassword()).into(PasswordPage.PASSWORD),
                Enter.theValue(data.get(0).getDataPassword()).into(PasswordPage.CONFIRM_PASSWORD),
                Click.on(PasswordPage.CHECK1),
                Click.on(PasswordPage.CHECK2),
                Click.on(PasswordPage.CHECK3),
                Click.on(PasswordPage.BUTTON_COMPLETE),
                WaitUntil.the(CheckPage.text, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds());

    }
}
