package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\Feature\\Login2.feature",
		glue="Stepefination",
		dryRun=false,
		monochrome=true
		
		)
public class Runner_Login2 {

}
