package co.com.retochoucair.tasks;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class EnterLocation implements Task {

    private List<testData> data;
    public EnterLocation(List<testData> data) {
        this.data = data;
    }

    public static EnterLocation thePage(List<testData> data) {
        return Tasks.instrumented(EnterLocation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getDataCity()).into(LocationPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(LocationPage.CITY),
                Hit.the(Keys.ENTER).into(LocationPage.CITY),
                Enter.theValue(data.get(0).getDataPostalCode()).into(LocationPage.POSTAL_CODE),
                Click.on(LocationPage.BUTTON_DEVICES));

    }
}
