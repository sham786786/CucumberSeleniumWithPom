package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/features/freecrm.feature",
//"src/main/java/features", //the path of the feature files
glue = "stepDefinations",   //"stepDefinations", //the path of the stepDefination files
plugin = {"html:target/LoginReport", "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",
        //extent report added
        //"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
        },
//format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
monochrome = true,//display the console output with proper readable format		
strict = true, //it will check if any step not defined in stepDefination file
dryRun=false //to check the mapping is correct/proper between feature and stepDefination
//tags= {"~@SmokeTest" , "~@Regression" , "~@End2End"} 
		)
public class TestRunner {
	/*extent report added
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("target/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	} extent report added*/

}

//OR : //tags={"@SmokeTest , @Regression"} -- execute all tests tagged as @SmokeTest OR  @Regression
//And : //tags={"@SmokeTest" , "@Regression"} -- execute all tests tagged as @SmokeTest AND  @Regression
//Not : //tags={"~@SmokeTest" , "@Regression"} -- execute all tests tagged as ~@SmokeTest NOT  @Regression