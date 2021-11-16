package pages;

import elements.DropDown;
import elements.InputField;
import objects.Account;
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

    public void create(Account account) {
        new InputField(driver, "Account Name").writeText(account.getAccountName());
        new InputField(driver, "Website").writeText(account.getWebSite());
        new DropDown(driver, "Industry").selectOption(account.getIndustryType());
        clickSave();
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
