package hillel.runners;

import hillel.config.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/hillel/features",//path to feature files
        glue = "hillel.steps",//package path
        tags = "@ALL"//list feature files for run

)
public class RUNNERHillel  {

}
