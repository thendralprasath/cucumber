package org.runner;
import org.base.Reportgenerate;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= { "src//test//resources//Sample.feature" }, glue= {"org.stedef"},monochrome=true,dryRun=true,
snippets=SnippetType.CAMELCASE,plugin= {"pretty",
		"html:C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target",
		"json:C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target\\report.json",
		"junit:C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target\\fb.xml",
		"json:C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target\\cucumber_report\\cucumber.json"
})

public class BaseTestRunner {
	
	@AfterClass
	public static void afterClass() {
		Reportgenerate.generateJvmReport("C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target\\cucumber_report\\cucumber.json");
	}
	
}
