package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failedrerun.txt",
        glue = "parallel",
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",
                "rerun:target/failedrerun.txt"
        })
public class FailedRun extends AbstractTestNGCucumberTests {
        	//AbstractTestNGCucumberTests is a class provided by Cucumber-TestNG.
        	//By extending it, your class gets the ability to:
        		//Read feature files. 		Execute scenarios. 		Work with TestNG.
        		//Support parallel execution

            @Override
            @DataProvider(parallel = true)
            public Object[][] scenarios() { //two dimentional array super refers to the parent class (AbstractTestNGCucumberTests
                return super.scenarios();
            }

}
