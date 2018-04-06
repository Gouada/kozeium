package runners;

//cummber TestRunner
import static core.Constants.HTML_RESULT_FOLDER;
import static core.Constants.JSON_RESULT_FOLDER;
import static core.Constants.XML_RESULT_FOLDER;
import static core.constants.Features.DB_NAVIGATOR_FEATURES;
import static core.constants.Steps.DB_NAVIGATOR_TRIPPLANER_STEPS;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:" + HTML_RESULT_FOLDER,
		"json:" + JSON_RESULT_FOLDER + "/db_navogator_tripPlaner.json",
		"junit:" + XML_RESULT_FOLDER + "/db_navogator_tripPlaner.xml" }, features = DB_NAVIGATOR_FEATURES, glue = {
				DB_NAVIGATOR_TRIPPLANER_STEPS }, tags = { "@tripPlaner" })
public class TripPlanerRunner {

}