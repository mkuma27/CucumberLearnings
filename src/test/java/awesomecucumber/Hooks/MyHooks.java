package awesomecucumber.Hooks;

import awesomecucumber.Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MyHooks {

    private WebDriver driver;


    @Before
    public void before(){
        driver= DriverFactory.initialization();
        driver.manage().window().maximize();
    }

    @After
    public void after(){
//        driver.quit();
    }
}
