package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reportgenerate {
	public static void generateJvmReport(String JsonFile)
	{
	File f1=new File("C:\\Users\\ARI\\Desktop\\eworkspace\\Cucumber\\target\\cucumber_report");
	Configuration config=new Configuration(f1,"sample project");
	config.addClassifications("platform", "Win 10");
	config.addClassifications("Browsers", "Chrome");
	config.addClassifications("sprint no", "45");
	List<String> li=new ArrayList<>();
	li.add(JsonFile);
	ReportBuilder builder=new ReportBuilder(li,config);
	builder.generateReports();
	
	}
 
}
