package org.tester.login.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/main/java/org/tester/login/Cucumber/",tags = {}, strict = true, dryRun = false, glue="org.tester.login.Cucumber", monochrome = true, plugin= {"html:target","json:target/cucumberReport.json"})

public class TestRunner {

	}
