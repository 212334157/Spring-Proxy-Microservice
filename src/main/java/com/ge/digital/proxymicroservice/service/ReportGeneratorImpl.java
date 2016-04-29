package com.ge.digital.proxymicroservice.service;

public class ReportGeneratorImpl implements ReportGenerator {
	 
    public ReportGeneratorImpl(){
        System.out.println("ReportGeneratorImpl instance created");
    }
    @Override
    public String displayReportTemplate(String reportFormat,int reportEntries) {
    	return null;
    }
    @Override
    public String  generateComplexReport(String reportFormat, int reportEntries){
    	return "ReportGeneratorImpl: Generating complex report in "+reportFormat+" format with "+ reportEntries+" entries";
 
    }
    @Override
    public String  generateSensitiveReport(){
       return "ReportGeneratorImpl: Generating sensitive report";
    }
 
}
