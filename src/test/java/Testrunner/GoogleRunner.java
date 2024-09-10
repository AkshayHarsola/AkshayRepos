package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\aakas\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\FeatureFiles\\A.feature",glue="stepdef")
public class GoogleRunner {
	

}
