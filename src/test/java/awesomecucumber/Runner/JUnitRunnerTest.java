package awesomecucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:tagret/cucumber.html"},

        dryRun = false,
        tags="@scenario1",
        glue={"awesomecucumber.stepdefs","awesomecucumber.Hooks"},
        features = "src/test/resources/awesomecucumber"
)
public class JUnitRunnerTest {
}

