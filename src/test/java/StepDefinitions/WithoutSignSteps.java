package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

public class WithoutSignSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to homepage")
    public void navigateToHomepage() {

        GWD.getDriver().get("https://www.hepsiburada.com/");
        GWD.getDriver().manage().window().maximize();

        dc.findAndClick("cookiee");
        dc.findAndClick("cookiee2");



    }

    @When("User search an product")
    public void userSearchAnProduct() {

        dc.findAndSend("search","asus");
        dc.findAndClick("searchButton");

    }

    @Then("User select product")
    public void userSelectProduct() {

        dc.findAndClick("product");



    }

    @And("User select product from two different seller")
    public void userSelectProductFromTwoDifferentSeller() {

        String anasayfaid = GWD.driver.getWindowHandle();
        Set<String> windowsid = GWD.driver.getWindowHandles();

        for (String id : windowsid
        ) {
            if (id.equals(anasayfaid)) continue;
            GWD.driver.switchTo().window(id);

        }
        dc.findAndClick("seller1");
        dc.findAndClick("selleresc");
        dc.findAndClick("seller2");
        dc.findAndClick("selleresc");

    }

    @Then("Navigate to cart")
    public void navigateToCart() {


        dc.findAndClick("cart");



    }

    @And("Check the cart")
    public void checkTheCart() {

        dc.findAndContainsText("cartcheck","asus");

    }
}
