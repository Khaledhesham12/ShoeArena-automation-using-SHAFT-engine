package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class addToCartPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By size =By.xpath("//li[@data-eu=\"40\"]");;
    private final By addToCartButton=By.xpath("//a[@title=\"Add to Shopping Bag\"]");
    private final By viewCartButton= By.xpath("//button[text()='View Cart']");
    private final By productName =By.xpath("//tr[@class=\"product-row \"]//div[@class=\"clsMainCartProductName\"]//p[2]");

    public addToCartPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public addToCartPage addToCart(){
        driver.element().click(size);
        driver.element().click(addToCartButton);
        driver.element().click(viewCartButton);
        return this;
    }
    public addToCartPage validateCart(String expectedName){
        driver.element().verifyThat(productName).text().equals(expectedName);
        return this;
    }
}
