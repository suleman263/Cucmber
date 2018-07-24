package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "Feature"
		,glue={"step_defination"}
		)
public class test_runner {

}
