import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;
public class ResultUpdatePersonalInformation {

    public static String resultUpdatePersonalInformation(){

        return driver.findElement(By.cssSelector(".alert")).getText();
    }

}
