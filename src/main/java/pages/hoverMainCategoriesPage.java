package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.Assert;

public class hoverMainCategoriesPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By mainCategory=By.xpath("//a[text()='Men']");
    private final By subCategory=By.xpath("//a[text()='Men']/following-sibling::div//a[text()='Shoes']");
    private final By title=By.xpath("//ol[@class=\"breadcrumb\"]//li[3]");
    public hoverMainCategoriesPage( SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public hoverMainCategoriesPage hoverMainCategories(){
        driver.element().hover(mainCategory);
        return this;
    }
    public hoverMainCategoriesPage validateTheChoosenCategory(){
        String textOfCategory=driver.element().getText(subCategory).toLowerCase();
        driver.element().click(subCategory);
        String titleOfCategory=driver.element().getText(title).toLowerCase();
        Assert.assertEquals(titleOfCategory,textOfCategory,"Title doesnt match text of category");
        return this;
    }

}
