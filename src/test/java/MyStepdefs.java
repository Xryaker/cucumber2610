import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("Print {string}")
    public void print(String arg0) {
        System.out.println(arg0);
    }
}
