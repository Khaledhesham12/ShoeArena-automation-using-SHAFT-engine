package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.addToCartPage;
import pages.searchPage;

public class addToCartTest extends testBase{
    private SHAFT.TestData.JSON testData;

    @Test(description = "Validate that the user can add the searched item to cart successfully")
    public void validateAddToCart(){
        new searchPage(driver).searchForItem(testData.getTestData("searchItem"));
        new addToCartPage(driver).addToCart()
                .validateCart(testData.getTestData("expectedName"));
    }
    @BeforeClass
    public void beforeClass(){
        testData=new SHAFT.TestData.JSON("searchData.json");
    }
}
