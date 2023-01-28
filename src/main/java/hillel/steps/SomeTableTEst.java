package hillel.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeTableTEst {

    @When("sout tableone")
    public void soutTableone(DataTable dataTable) {
        List<String> likst=dataTable.asList();
        for(String l:likst){
            System.out.println(l);
        }
    }

    @When("soutlistMAps")
    public void soutlistmaps(DataTable dataTable) {
        List<Map<String,String>> mapList=dataTable.asMaps();

    }

    @When("soutmap")
    public void soutmap(Map<String, Map<String, String>> stringMapMap) {
        System.out.println(stringMapMap.get("KSEA"));
        System.out.println(stringMapMap.get("KSEA").get("lat"));


    }
}
