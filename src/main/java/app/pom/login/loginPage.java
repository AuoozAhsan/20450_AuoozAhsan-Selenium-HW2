package app.pom.homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginPage extends BasePage {
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="pass")
    public WebElement pass;


    @FindBy(name="send")
    public WebElement signin;



    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    public WebElement signinLink;

    @FindBy(xpath = "(//li[@class='greet welcome'])[1]")
    public WebElement welcompage;

    public loginPage(){
        PageFactory.initElements(driver, this);
    }


    public void login()
    {
        clickOnElement(signinLink);
        sendKeysToElement(email, "goodbook926@gmail.com");
        sendKeysToElement(pass, "GoodBook#6");
        clickOnElement(signin);


    }

    public void loginwithparam(String emailid,String password)
    {
        clickOnElement(signinLink);
        sendKeysToElement(email, emailid);
        sendKeysToElement(pass, password);
        clickOnElement(signin);


    }
}
