package RunnerObject;
import framework.ParentScenario;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/features"},
        glue = {"test"},
        monochrome = true,
        publish = false,
        plugin = { "pretty", "html:target/reports/cucumber-htmlreport.html",
                "json:target/reports/JSONReports.json",
                "junit:target/reports/XMLReports.xml"}
)

public class Runner extends ParentScenario {
    @AfterClass
    public static void teardown() {
        BasePage.teardownBaseObject();
    }
}
