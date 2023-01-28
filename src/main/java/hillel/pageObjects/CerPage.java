package hillel.pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CerPage {
    @FindBy(xpath = "//*[@name=\"certificate\"]")
    WebElement field;
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]")
    WebElement msg;

    public CerPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public boolean checkCER(String number) {
        try {
            field.sendKeys(number);
            field.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        } catch (ElementNotInteractableException ignore) {

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return !msg.getAttribute("class").contains("invalid");
    }


}
