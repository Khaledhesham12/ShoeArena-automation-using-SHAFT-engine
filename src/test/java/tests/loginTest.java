package tests;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;

@Epic("User Management")
@Story("Login")
public class loginTest extends testBase{
    private SHAFT.TestData.JSON testRegisterData;
    private SHAFT.TestData.JSON testLoginData;

    @Test(description = "Validate that the user can login with valid data successfully")
    public void validateValidLogin(){
        new homePage(driver).navigateToLoginPage();
        new loginPage(driver).fillValidLoginData(testRegisterData.getTestData("email"),
                        testRegisterData.getTestData("password")).clickOnLoginButton()
                .validateValidLogin(testRegisterData.getTestData("assertionMessage"));
    }
    @Test(description = "Validate that the user cannot login with invalid data successfully")
    public void validateInValidLogin() {
        new homePage(driver).navigateToLoginPage();
        new loginPage(driver).fillInValidLoginData(testLoginData.getTestData("wrongEmail")
                ,testRegisterData.getTestData("password")).clickOnLoginButton()
                .validateInValidLogin(testLoginData.getTestData("expectedMessage"));
    }
        @BeforeClass
    public void beforeClass(){
        testRegisterData=new SHAFT.TestData.JSON("registerData.json");
        testLoginData=new SHAFT.TestData.JSON("loginData.json");
    }

}
