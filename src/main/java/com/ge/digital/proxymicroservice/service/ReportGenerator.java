package com.ge.digital.proxymicroservice.service;

public interface ReportGenerator {
	String displayReportTemplate(String reportFormat,int reportEntries);
    String generateComplexReport(String reportFormat,int reportEntries);
    String generateSensitiveReport();
}
