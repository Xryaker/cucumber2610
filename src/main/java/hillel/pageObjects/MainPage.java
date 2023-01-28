package hillel.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(id = "btn-consultation-hero")
    public WebElement consultationButton;
    @FindBy(className = "form_title")
   public WebElement titleForm;
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id="input-email-consultation")
    WebElement mail;
    @FindBy(id = "input-tel-consultation")
    WebElement tel;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void sentDataToForm(String name,String mail,String tel){
        this.name.sendKeys(name);
        this.mail.sendKeys(mail);
        this.tel.sendKeys(tel);
    }
}
