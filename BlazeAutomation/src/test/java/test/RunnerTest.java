package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@ID_0001, @ID_0002, @ID_0003, @ID_0004, @ID_0005, @ID_0006, @ID_0007,"
		+ " @ID_0008, @ID_0009, @ID_0010, @ID_0011, @ID_0012" }, features = "src/test/resources/blaze.feature", glue = "test", plugin = {
				"pretty", "html:target/reporthtml",
				"json:target/report.json" }, snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false, strict = false)
public class RunnerTest {

}
