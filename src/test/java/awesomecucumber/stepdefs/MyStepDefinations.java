package awesomecucumber.stepdefs;

import awesomecucumber.Factory.DriverFactory;
import awesomecucumber.Pages.CartPage;
import awesomecucumber.Pages.StorePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class MyStepDefinations {
    private WebDriver driver;


    @Given("I am on Store Page")
    public void i_am_on_store_page() {
        driver= DriverFactory.getDriver();
        driver.get("https://askomdch.com/store/");
    }


    @Then("I add {string} to the cart")
    public void i_add_to_the_cart(String productName) {
        StorePage storePage=new StorePage(driver);
        storePage.addProductToCart(productName);
    }

    @Then("I see {int} {string} to the cart")
    public void i_see_to_the_cart(int  actualQuantity, String productName) {
        CartPage cartPage=new CartPage(driver);

        Assert.assertEquals(productName,cartPage.getProductName());
        Assert.assertEquals(actualQuantity,cartPage.getQuantity());

    }

}
