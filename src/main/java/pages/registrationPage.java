package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class registrationPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By firstNameTxt = By.id("registerfirst");
    private final By lastNameTxt = By.id("registerlast");
    private final By emailTxt = By.id("registeremail");
    private final By passwordTxt = By.id("registerpassword");
    private final By gender = By.xpath("//input[@value=\"male\"]");
    private final By submitButton = By.xpath("//div[@class=\"clsNotRegister\"]//input[@id=\"submit\"]");
    private final By assertMessage=By.xpath("//p[text()='First Name : Automation']");

    public registrationPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public registrationPage enterRegisterData(String firstName, String lastName, String email, String password){
        driver.element().type(firstNameTxt,firstName);
        driver.element().type(lastNameTxt,lastName);
        driver.element().type(emailTxt,email);
        driver.element().type(passwordTxt,password);
        driver.element().click(gender);
        return this;
    }
    public registrationPage clickOnSubmitButton(){
        driver.element().click(submitButton);
        return this;
    }
    public registrationPage validateValidRegister(String assertionMessage){
        driver.verifyThat().element(assertMessage).text().equals(assertionMessage);
        return this;
    }

}
