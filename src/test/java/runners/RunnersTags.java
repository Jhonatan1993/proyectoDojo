package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/scenario_outline.feature",
        tags = "@Escenario1",
        glue = "stepsDesinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnersTags {
}