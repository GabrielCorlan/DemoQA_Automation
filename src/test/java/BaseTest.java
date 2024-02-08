
import data.Constants;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    @BeforeEach
    protected void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL.getValue());
    }
}
