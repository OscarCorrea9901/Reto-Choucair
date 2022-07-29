package co.com.retochoucair.questions;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.userinterface.CheckPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class answer implements Question<Boolean> {
    private List<testData> data;

    public answer(List<testData> data) {
        this.data = data;
    }

    public static answer toThe(List<testData> data) {
        return new answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String tittle = Text.of(CheckPage.text).viewedBy(actor).asString();
        return data.get(0).getDataFinalText().equals(tittle);
    }
}
