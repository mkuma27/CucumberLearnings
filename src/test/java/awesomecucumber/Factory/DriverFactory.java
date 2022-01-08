package awesomecucumber.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initialization(){
        System.setProperty("webdriver.chrome.driver", "C:\\diskE\\Drivers\\chromedriver.exe");

        driver=new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
