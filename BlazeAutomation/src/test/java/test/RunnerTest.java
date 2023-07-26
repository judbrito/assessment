package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/blaze.feature", glue = "test", plugin = { "pretty",
		"html:target/reporthtml",
		"json:target/report.json" }, snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false, strict = false, tags = {
				"@ID_0001 or @ID_0002 or @ID_0003 or @ID_0004 or @ID_0005 or @ID_0006 or @ID_0007 or @ID_0008 or @ID_0009 or @ID_0010 or @ID_0011 or @ID_0012" })
public class RunnerTest {

}
