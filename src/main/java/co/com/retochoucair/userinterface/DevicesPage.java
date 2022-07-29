package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target CLICK_COMPUTER = Target.the("button that show us the form to computer container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target COMPUTER = Target.the("button that show us the form to computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target CLICK_VERSION = Target.the("button that show us the form to version container")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target VERSION = Target.the("button that show us the form to version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target CLICK_LANGUAGE = Target.the("button that show us the form to language container")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target LANGUAGE = Target.the("button that show us the form to language")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target CLICK_MOBILE = Target.the("button that show us the form to mobile container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE = Target.the("button that show us the form to mobile")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target CLICK_MODEL = Target.the("button that show us the form to model container")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODEL = Target.the("button that show us the form to model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target CLICK_SYSTEM = Target.the("button that show us the form to system container")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SYSTEM = Target.the("button that show us the form to system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_lASTPAGE = Target.the("button that directs to the next last page")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
