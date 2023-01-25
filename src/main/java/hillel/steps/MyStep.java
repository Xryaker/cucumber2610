package hillel.steps;

import hillel.config.BaseClass;
import hillel.pageObjects.CerPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;

public class MyStep extends BaseClass {
    CerPage cerPage= new CerPage(getDriver());
    @AfterAll
    public static void after(){
        getDriver().quit();
    }
    @When("I open page {string}")
    public void iOpenPage(String url) {
        getDriver().get(url);
    }


    @And("cent cerNumber {string} {string}")
    public void centCerNumber(String number, String result) {
        Assert.assertEquals("#"+number,String.valueOf(cerPage.checkCER(number)),result);

    }
}
