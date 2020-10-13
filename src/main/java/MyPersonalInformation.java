import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;
public class MyPersonalInformation {

    public static void goToMyPersonalInformation(){

        /*Se accede a la vista 'My personal information' realizando clic en la tarjeta*/
        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();

    }
}
