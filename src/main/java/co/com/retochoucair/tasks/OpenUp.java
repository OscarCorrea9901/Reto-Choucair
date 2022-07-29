package co.com.retochoucair.tasks;

import co.com.retochoucair.userinterface.Utest_Site;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private Utest_Site utest_site;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utest_site),
                Click.on(Utest_Site.JOIN_BUTTON));

    }
}
