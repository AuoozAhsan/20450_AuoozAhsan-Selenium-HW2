package app.pom.homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends BasePage {
    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;


    @FindBy(xpath = "//input[@id='is_subscribed']")
    public WebElement newsLetter;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(xpath = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement passwordconfirmation;


    @FindBy(xpath = "//button[@title='Create an Account']")
    public WebElement createaccount;

    @FindBy(xpath = "//div[contains(text(),'Thank you for registering with Main Website Store.')]")
    public WebElement registeruservalidation;

    @FindBy(xpath = "(//a[contains(text(),'Create an Account')])[1]")
    public WebElement createaccountLink;


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void registration() {
        clickOnElement(createaccountLink);
        sendKeysToElement(firstname, "good");
        sendKeysToElement(lastname, "book");
        clickOnElement(newsLetter);
        sendKeysToElement(email, "goodbook926@gmail.com");
        sendKeysToElement(password, "GoodBook#6");
        sendKeysToElement(passwordconfirmation, "GoodBook#6");
        clickOnElement(createaccount);

    }

    public void createAccountwithParam(String fName, String lName, String emailId, String pass) {
        clickOnElement(createaccountLink);
        sendKeysToElement(firstname, fName);
        sendKeysToElement(lastname, lName);
        clickOnElement(newsLetter);
        sendKeysToElement(email, emailId);
        sendKeysToElement(password, pass);
        sendKeysToElement(passwordconfirmation, pass);
        clickOnElement(createaccount);
    }
}
