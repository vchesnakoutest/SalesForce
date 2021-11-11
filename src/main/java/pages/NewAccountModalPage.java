package pages;

import elements.InputField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage{

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public static final String SAVE_BUTTON_XPATH = "//*[contains(@class,'forceActionButton')]//*[text()='Save']";

    public void openPage() {
        driver.get("https://pandadoc9.lightning.force.com/lightning/o/Account/new");
    }

    public void create(String accountName, String webSite) {
        new InputField(driver, "Account Name").writeText(accountName);
        new InputField(driver, "Website").writeText(webSite);
        clickSave();
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
