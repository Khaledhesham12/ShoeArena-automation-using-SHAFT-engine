package tests;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homePage;
import pages.registrationPage;

@Epic("User Management")
@Story("Register")
public class registrationTest extends testBase {
    private SHAFT.TestData.JSON testData;

    @Test(description = "Validate that the User can register with valid account successfully")
    public void validateRegister(){
        new homePage(driver).navigateToRegisterPage();
        new registrationPage(driver).enterRegisterData(testData.getTestData("firstName")
                ,testData.getTestData("lastName"),testData.getTestData("email")
                        ,testData.getTestData("password")).clickOnSubmitButton()
                .validateValidRegister(testData.getTestData("assertionMessage"));
        new homePage(driver).clickOnLogoutButton();
    }
    @BeforeClass
    public void beforeClass(){
        testData=new SHAFT.TestData.JSON("registerData.json");
    }
}
