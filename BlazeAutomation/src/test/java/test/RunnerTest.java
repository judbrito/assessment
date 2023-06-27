package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/blaze.feature", glue = "test", plugin = { "pretty",
		"html:target/reporthtml",
		"json:target/report.json" }, snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false, strict = false)

public class RunnerTest {

}
