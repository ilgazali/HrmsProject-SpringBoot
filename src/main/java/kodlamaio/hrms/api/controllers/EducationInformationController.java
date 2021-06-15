package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationInformationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationInformation;
import kodlamaio.hrms.entities.dtos.EducationInformationDto;

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
	
	@GetMapping("/getEducationInformationsByUserId")
	public DataResult<List<EducationInformationDto>>getEducationInformationsByUserId(@RequestParam int jobseekerId){
	
		return this.educationInformationService.getEducationInformationsByUserId(jobseekerId);
	}
	
}
