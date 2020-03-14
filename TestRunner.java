package org.tst;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sts.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.sts", monochrome = true, dryRun = false, plugin = {
		"html:D:\\Cucumberday1\\src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\out.json"})
public class TestRunner {
@AfterClass
public static void reportsGenerations() {
	JvmReport.generateJvmJvmReport("src\\test\\resources\\Reports\\out.json");

}
}
