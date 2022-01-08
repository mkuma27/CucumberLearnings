package awesomecucumber.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@class='product-name']//a")
    private WebElement productName;

    @FindBy(xpath = ".quantity")
    private WebElement productQuantity;


    public CartPage(WebDriver driver) {
        super(driver);
    }
    public String getProductName(){
        return wait.until(ExpectedConditions.visibilityOf(productName)).getText();

    }

    public int getQuantity(){
       return  Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQuantity)).getAttribute("value"));


    }
}
