package awesomecucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {
    private WebDriver driver;




    public StorePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    @FindBy(xpath = "//a[@title='View cart']")
    private WebElement viewCart;



public void addProductToCart(String productName){

    By addToCart=By.xpath("//*[@aria-label='Add “"+ productName + "” to your cart']");
    wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    wait.until(ExpectedConditions.visibilityOf(viewCart)).click();
}


}
