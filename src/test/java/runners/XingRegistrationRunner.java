package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static core.Constants.*;
import static core.constants.Features.XING_FEATURES;
import static core.constants.Steps.XING_STEPS;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:" + HTML_RESULT_FOLDER + "/xing",
        "json:" + JSON_RESULT_FOLDER + "/xing.json",
        "junit:" + XML_RESULT_FOLDER
                + "/calculator.xml"}, features = XING_FEATURES, glue = XING_STEPS, tags = {
        "@xing"})

public class XingRegistrationRunner {

}
