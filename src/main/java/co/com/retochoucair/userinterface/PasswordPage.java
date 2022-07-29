package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {
    public static final Target PASSWORD = Target.the("field to user password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("field to confirm user password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK1 = Target.the("Check box to permission 1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK2 = Target.the("Check box to permission 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK3 = Target.the("Check box to permission 3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Button that directs to the complete setup")
            .located(By.id("laddaBtn"));

}
