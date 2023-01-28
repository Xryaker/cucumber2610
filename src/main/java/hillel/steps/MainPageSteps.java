package hillel.steps;

import hillel.config.BaseClass;
import hillel.pageObjects.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MainPageSteps extends BaseClass {
    MainPage mainPage=new MainPage(getDriver());
    @And("Click button cunsultation")
    public void clickButtonCunsultation() {
    mainPage.consultationButton.click();
    }

    @Then("Check open consultation form {string}")
    public void checkOpenConsultationForm(String str) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(mainPage.titleForm.getText(),str);
    }
}
