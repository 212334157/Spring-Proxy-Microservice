package com.ge.digital.proxymicroservice.restcontrollers;


import com.ge.digital.proxymicroservice.service.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyMicroserviceController {
	
	private Role accessRole = new Role("Manager");
	private ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
	
	@RequestMapping("/complex-report/{format}/{entries}")
	String generateCompReport(@PathVariable("format")String reportFormat,@PathVariable("entries")int reportEntries){
		return proxy.generateComplexReport(reportFormat, reportEntries);
	}
	
	@RequestMapping("/sensitive-report")
	String generateSensReport(){
		return proxy.generateSensitiveReport();
	}
	
	@RequestMapping("/template/{format}/{entries}")
	String getReportTemplate(@PathVariable("format")String reportFormat,@PathVariable("entries")int reportEntries){
		return proxy.displayReportTemplate(reportFormat, reportEntries);
	}
}
