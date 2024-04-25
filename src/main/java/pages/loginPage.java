package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class loginPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By emailTxt  = By.xpath("//input[@id=\"notifyemail\"]");
    private final By passwordTxt = By.id("notifypassword");
    private final By signInButton = By.xpath("//div[@class=\"clsNotLogin\"]//input[@id=\"submit\"]");
    private final By assertMessage=By.xpath("//p[text()='First Name : Automation']");
    private final By alertMessage=By.xpath("//div[@class=\"clsLNotify\"]//div[1]");

    public loginPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public loginPage fillValidLoginData(String email,String password){
       driver.element().type(emailTxt,email);
       driver.element().type(passwordTxt,password);
       return this;
    }
    public loginPage validateValidLogin(String assertionMessage){
        driver.verifyThat().element(assertMessage).text().equals(assertionMessage);
        return this;
    }
    public loginPage fillInValidLoginData(String wrongEmail,String password){
        driver.element().type(emailTxt,wrongEmail);
        driver.element().type(passwordTxt,password);
        return this;
    }
    public loginPage validateInValidLogin(String expectedMessage){
        driver.verifyThat().element(alertMessage).text().equals(expectedMessage);
        return this;
    }
    public loginPage clickOnLoginButton(){
        driver.element().click(signInButton);
        return this;
    }

}
