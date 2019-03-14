package co.com.alkosto.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/MakeAPurchase.feature",
		glue = "co.com.alkosto.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class MakeAPurchaseRunner {

}
