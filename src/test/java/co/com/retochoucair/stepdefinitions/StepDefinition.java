package co.com.retochoucair.stepdefinitions;

import co.com.retochoucair.model.testData;
import co.com.retochoucair.questions.answer;
import co.com.retochoucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinition {
    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("^That Oscar wants to register on the Utest page$")
    public void thatOscarWantsToRegisterOnTheUtestPage()  {
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage());
    }

    @When("^Enter all the required data and necessary permissions$")
    public void enterAllTheRequiredDataAndNecessaryPermissions(List<testData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterPersonalData.thaPage(data), EnterLocation.thePage(data),
                EnterDevices.thePage(data), EnterPassword.thePage(data));

    }

    @Then("^He completes the registration successfully on the page$")
    public void heCompletesTheRegistrationSuccessfullyOnThePage(List<testData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(answer.toThe(data)));

    }

}
