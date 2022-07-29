package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage {
    public static final Target FIRST_NAME = Target.the("box that show us the form to name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("box that show us the form to last name")
            .located(By.id("lastName"));
    public static final Target E_MAIL = Target.the("box that show us the form to email")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("box that show us the form to birth month")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("box that show us the form to birthday")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("box that show us the form to birth year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("button that directs to the next location")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
