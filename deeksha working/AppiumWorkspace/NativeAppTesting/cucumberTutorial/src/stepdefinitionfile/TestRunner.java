package stepdefinitionfile;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//Output report to be html
@Cucumber.Options(format=("html:output"))

public class TestRunner {

}
