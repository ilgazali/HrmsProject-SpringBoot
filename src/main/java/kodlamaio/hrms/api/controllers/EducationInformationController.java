package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationInformationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationInformation;

@RestController
@RequestMapping("/api/education_informations")
public class EducationInformationController {

	private EducationInformationService educationInformationService;
	
	
	@Autowired
	public EducationInformationController(EducationInformationService educationInformationService) {
		super();
		this.educationInformationService = educationInformationService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody EducationInformation educationInformation) {
		
		return this.educationInformationService.add(educationInformation);
	}
}
