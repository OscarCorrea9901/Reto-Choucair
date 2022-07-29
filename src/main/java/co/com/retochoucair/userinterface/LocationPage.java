package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY = Target.the("box that show us the form to city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("box that show us the form to postal code")
            .located(By.id("zip"));
    public static final Target BUTTON_DEVICES = Target.the("button that directs to the next devices")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
