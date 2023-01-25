import hillel.config.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/hillel/features",//path to feature files
        glue = "step",//package path
        tags = "@CER"//list feature files for run

)
public class RUNNERHillel  extends BaseClass{
    @BeforeClass
    public static void creaT(){
        if (driver==null){
            BaseClass.starT();
        }
    }
    @AfterClass
    public static void enDD() throws InterruptedException {
        if(driver!=null){
            BaseClass.enD();
        }
    }
}
