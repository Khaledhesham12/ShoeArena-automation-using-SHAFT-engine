package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class contactUsPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By mobileTxt = By.id("contact-mobile");
    private final By messageTxt = By.id("contact-enquiry");
    private final By subjectForm = By.id("contact-subject");
    private final By submitButton = By.name("submit");

    public contactUsPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public contactUsPage enterContactUsData(String mobile,String subjectValue,String message){
        driver.element().type(mobileTxt,mobile);
        driver.element().select(subjectForm,subjectValue);
        driver.element().type(messageTxt,message);
        return this;
    }
    public contactUsPage clickOnSubmitButton(){
        driver.element().click(submitButton);
        return this;
    }
}

