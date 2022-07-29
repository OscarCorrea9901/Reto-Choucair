package co.com.retochoucair.tasks;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class EnterPersonalData implements Task {
    private List<testData> data;

    public EnterPersonalData(List<testData> data) {
        this.data = data;
    }

    public static EnterPersonalData thaPage(List<testData> data) {
        return Tasks.instrumented(EnterPersonalData.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getDataName()).into(PersonalDataPage.FIRST_NAME),
                Enter.theValue(data.get(0).getDataLastName()).into(PersonalDataPage.LAST_NAME),
                Enter.theValue(data.get(0).getDataEmail()).into(PersonalDataPage.E_MAIL),
                SelectFromOptions.byVisibleText(data.get(0).getDataBirthMonth()).from(PersonalDataPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getDataBirthDay()).from(PersonalDataPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getDataBirthYear()).from(PersonalDataPage.BIRTH_YEAR),
                Click.on(PersonalDataPage.BUTTON_NEXT));


    }
}
