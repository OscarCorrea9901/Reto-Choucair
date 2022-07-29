package co.com.retochoucair.tasks;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class EnterDevices implements Task {
    private List<testData> data;

    public EnterDevices(List<testData> data) {
        this.data = data;
    }


    public static EnterDevices thePage(List<testData> data) {
        return Tasks.instrumented(EnterDevices.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicesPage.CLICK_COMPUTER),
                Enter.theValue(data.get(0).getDataComputer()).into(DevicesPage.COMPUTER).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.CLICK_VERSION),
                Enter.theValue(data.get(0).getDataVersion()).into(DevicesPage.VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.CLICK_LANGUAGE),
                Enter.theValue(data.get(0).getDataLanguage()).into(DevicesPage.LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.CLICK_MOBILE),
                Enter.theValue(data.get(0).getDataMobile()).into(DevicesPage.MOBILE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.CLICK_MODEL),
                Enter.theValue(data.get(0).getDataModel()).into(DevicesPage.MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.CLICK_SYSTEM),
                Enter.theValue(data.get(0).getDataSystem()).into(DevicesPage.SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DevicesPage.BUTTON_lASTPAGE));

    }
}
