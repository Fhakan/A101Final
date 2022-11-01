package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



    @FindBy(xpath = " //button[contains(@id, 'trust')]")
    private WebElement cookiee;

    @FindBy(xpath = " //button[contains(@id, 'ommended')]")
    private WebElement cookiee2;
    @FindBy(xpath = "//input[contains(@class, 'sXL9')]")
    private WebElement search;

    @FindBy(xpath = "//div[contains(@class, 'aAbGyX')]")
    private WebElement searchButton;

    @FindBy(id = "i0")
    private WebElement product;


    @FindBy(xpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button")
    private WebElement seller1;

    @FindBy(xpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[2]/td[3]/div/form/button")
    private WebElement seller2;

    @FindBy(xpath = " //a[contains(@class, 'iZX')]")
    private WebElement selleresc;

    @FindBy(xpath = "//*[@id=\"shoppingCart\"]")
    private WebElement cart;


    @FindBy(xpath = " //*[contains(text(),'Asus ROG Strix')]")
    private WebElement cartcheck;

    //------------------

    @FindBy(id = "myAccount")
    private WebElement giris;

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"txtUserName\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[@id=\"txtPassword\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"btnEmailSelect\"]")
    private WebElement loginbtn2;

    @FindBy(xpath = "//*[@id=\"myAccount\"]/span/a/span[2]")
    private WebElement usernamecheck;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "search":myElement = search; break;

            case "userName":myElement = userName; break;
            case "password":myElement = password; break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "searchButton": myElement = searchButton; break;
            case "product": myElement = product; break;
            case "cookiee": myElement = cookiee; break;
            case "cookiee2": myElement = cookiee2; break;

            case "seller1": myElement = seller1; break;
            case "seller2": myElement = seller2; break;
            case "selleresc": myElement = selleresc; break;

            case "cart": myElement = cart; break;

            case "giris": myElement = giris; break;
            case "login": myElement = login; break;
            case "loginbtn": myElement = loginbtn; break;
            case "loginbtn2": myElement = loginbtn2; break;





        }


        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
          case "cartcheck": myElement = cartcheck; break;

            case "usernamecheck": myElement = usernamecheck; break;


        }
        verifyContainsText(myElement, text);
    }
}
