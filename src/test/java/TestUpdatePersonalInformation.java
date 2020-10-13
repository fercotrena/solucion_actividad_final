import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUpdatePersonalInformation {


    @BeforeEach
    public void setUp() {
        WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updatePersonalInformation() {
        Authentication.login("fernandocotrena@gmail.com", "admin123456");
        MyPersonalInformation.goToMyPersonalInformation();
        UpdatePersonalInformation.updatePersonalInformation("fernando", "Cotrena", "admin123456",
                "admin123456", "admin123456");

        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertEquals("Your personal information has been successfully updated.", ResultUpdatePersonalInformation.resultUpdatePersonalInformation());
    }
}
