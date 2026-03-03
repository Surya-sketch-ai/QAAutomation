package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features\\Login.feature",glue= {"Stepdefinitions"},
				 monochrome=true, dryRun=false, plugin= {"pretty","html:target/Loginpage.html"})
public class Runner extends AbstractTestNGCucumberTests{

}
