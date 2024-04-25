package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class testBase {
     SHAFT.GUI.WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://www.shoearena.sa/en");
    }
    @AfterMethod
    public void closeWindow(){
        driver.browser().closeCurrentWindow();
    }

}
