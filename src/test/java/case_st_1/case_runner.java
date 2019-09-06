package case_st_1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin="json:sandeep_case_study.json")
public class case_runner
{

}
