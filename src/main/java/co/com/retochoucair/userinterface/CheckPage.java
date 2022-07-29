package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckPage {
    public static final Target text = Target.the("sample confirmation text")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
}
