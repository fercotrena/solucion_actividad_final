import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.WebDriverSupliter.driver;
/*
* Esta clase no es requerida para completar la tarea.
* Puede quedar resuelto sin dividir en esta capa.
* Por ejemplo como quedo en la clase MyPersonalInformation
* */
public class AuthenticationElement {
    public static String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static WebElement EMAIL = driver.findElement(By.id("email"));
    public static WebElement PASSWORD = driver.findElement(By.id("passwd"));
    public static WebElement SUBMIT_LOGIN = driver.findElement(By.cssSelector("#SubmitLogin > span"));

}
