package RunnerPackage1;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "ResourcesSource1/FeaturePackage", glue = "DefinitionPackage1",
plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml",
"html:target/cucumber-reports/reports2.html"}, monochrome = true, dryRun = false)

public class TestRunnerClass1 {
	public static void main(String[] args) {
		
	}
}
