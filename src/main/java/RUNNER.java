import hillel.config.BaseClass;
import hillel.config.Browsers;
import hillel.config.DriverConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/example",//path to feature files
        glue = "steps",//package path
        tags = "@ALL"//list feature files for run

)
public class RUNNER extends BaseClass {

}
