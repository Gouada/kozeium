package runners.runners;

import static core.Constants.HTML_RESULT_FOLDER;
import static core.constants.Features.CALCULATOR_FEATURES;
import static core.constants.Steps.CALCULATOR_STEPS;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:" + HTML_RESULT_FOLDER, "json:cucumber.json",
		"junit:cucumber.xml" }, features = CALCULATOR_FEATURES, glue = CALCULATOR_STEPS, tags = { "@calculator" })
public class CalculatorRunner {

}
