package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class homePage {
    private final SHAFT.GUI.WebDriver driver;
    private final By accountManagerIcon = By.xpath("//div[contains(@class,'dropdown cart-dropdown clsMobileLogin')]");
    private final By sigunUpButton = By.className("clsRlink");
    private final By logoutButton=By.xpath("//p[@class=\"welcome-msg\"]//a[text()='Logout']");
    private final By contactUsPage=By.xpath("//div[@class=\"header-top\"]//a[text()='Contact Us']");

    public homePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public void navigateToRegisterPage() {
        driver.element().click(accountManagerIcon);
        driver.element().click(sigunUpButton);
    }
    public void navigateToLoginPage(){
        driver.element().click(accountManagerIcon);
    }
    public void clickOnLogoutButton(){
        driver.element().click(logoutButton);
    }
    public void navigateToContactUsPage() {
        driver.element().click(contactUsPage);
    }


}
