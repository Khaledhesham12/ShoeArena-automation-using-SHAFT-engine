package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.contactUsPage;
import pages.homePage;
import pages.loginPage;

public class contactUsTest extends testBase {
    SHAFT.TestData.JSON testContactUsData;
    SHAFT.TestData.JSON testRegisterData;


    @Test(description = "Validate that the user can contact successfully ")
    public void validateContactUs()  {
        new homePage(driver).navigateToLoginPage();
        new loginPage(driver).fillValidLoginData(testRegisterData.getTestData("email"),
                testRegisterData.getTestData("password")).clickOnLoginButton();
        new homePage(driver).navigateToContactUsPage();
        new contactUsPage(driver).enterContactUsData(testContactUsData.getTestData("mobile")
                ,testContactUsData.getTestData("subjectValue")
                ,testContactUsData.getTestData("message")).clickOnSubmitButton();
    }
    @BeforeClass
    public void beforeClass(){
        testContactUsData=new SHAFT.TestData.JSON("contactUsData.json");
        testRegisterData=new SHAFT.TestData.JSON("registerData.json");
    }
}
