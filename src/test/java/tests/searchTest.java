package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.searchPage;

public class searchTest extends testBase{
    SHAFT.TestData.JSON testData;

    @Test(description = "validate that the user can search for item successfully")
    public void searchForItem(){
        new searchPage(driver).searchForItem(testData.getTestData("searchItem"));
    }

    @BeforeClass
    public void beforeClass(){
        testData=new SHAFT.TestData.JSON("searchData.json");

    }
}
