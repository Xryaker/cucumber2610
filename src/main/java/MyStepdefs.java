import hillel.config.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MyStepdefs extends BaseClass {
    @When("I open page {string}")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @And("cent cerNumber {string}")
    public void centCerNumber(String arg0) {
        System.out.println(arg0);
    }
}
