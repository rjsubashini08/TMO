package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features/",
glue={"StepDefinitions"},
plugin = {"json:target/cucumber-json-report.json"},
//plugin = {"prettyp-", "html:test-output", "json:target/cucumber-json-report.json", "junit:junit_xml/cucumber.xml"},
monochrome = true,//displays the console output in a readable format
tags={"@results"},
dryRun = false
)
public class TestRunner {
}