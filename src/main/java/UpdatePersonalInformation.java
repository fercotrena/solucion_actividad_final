import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;
public class UpdatePersonalInformation {


    public static void updatePersonalInformation(String firstname, String lastname,
                                                 String old_password, String password,
                                                 String confirmation) {
        /*Se actualizan los datos personales del usuario*/


        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("old_passwd")).sendKeys(old_password);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        driver.findElement(By.id("newsletter")).click();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();




    }


}
