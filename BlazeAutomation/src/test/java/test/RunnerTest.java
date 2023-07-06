package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/blaze.feature",
    glue = "test",
    plugin = { "pretty", "html:target/reporthtml", "json:target/report.json" },
    tags = { "@ID_0001 or @ID_0002 or @ID_0003 or @ID_0004 or  @ID_0005 or  @ID_0006" }, 
    snippets = SnippetType.CAMELCASE,
    monochrome = false,
    dryRun = false,
    strict = false
)
public class RunnerTest {

}
