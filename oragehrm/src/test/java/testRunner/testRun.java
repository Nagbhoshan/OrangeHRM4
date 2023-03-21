package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Nagabhooshan\\oragehrm\\features\\AddEmp.feature",
monochrome=true,
glue="Stepdefination",dryRun=false)

public class testRun {

}
