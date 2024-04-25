package tests;

import org.testng.annotations.Test;
import pages.hoverMainCategoriesPage;

public class hoverMainCategoriesTest extends testBase{
    @Test(description = "Validate that the user can hover main category and choose sub category successfully")
    public void validateHover(){
        new hoverMainCategoriesPage(driver).hoverMainCategories().validateTheChoosenCategory();
    }

}
