package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WithSignSteps {

    DialogContent dc = new DialogContent();
    @Then("User enter true email and password")
    public void userEnterTrueEmailAndPassword() {


        dc.findAndClick("giris");
        dc.findAndClick("login");
        dc.findAndSend("userName","username@gmail.com");
        dc.findAndClick("loginbtn");
        dc.findAndSend("password","userpassword");
        dc.findAndClick("loginbtn2");


    }

    @And("Check the login")
    public void checkTheLogin() {
        dc.findAndContainsText("usernamecheck","username");
    }
}
