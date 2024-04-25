package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class searchPage {
    SHAFT.GUI.WebDriver driver;
    private final By searchBox= By.id("search-box");
    private final By firstProduct=By.xpath("//div[@class=\"clsProductList\"]//div[@class=\"row row-sm\"]/div[1]");
    private final By searchButton=By.id("search-submit");
    public searchPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public searchPage searchForItem(String searchItem){
            driver.element().type(searchBox,searchItem);
            driver.element().click(searchButton);
            driver.element().click(firstProduct);
            return this;
    }


}
