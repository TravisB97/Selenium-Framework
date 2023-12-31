package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"Steps"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JUnitReports/report.xml",
		"html:targetHtmlReports"}

)
public class TestRunner {

}
