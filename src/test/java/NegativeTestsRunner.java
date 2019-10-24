import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/article_about_fruit.feature"
        ,tags = {"@NegativeRegressionSuit"}
)
public class NegativeTestsRunner {
}
