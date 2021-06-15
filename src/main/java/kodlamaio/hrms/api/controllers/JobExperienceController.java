package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.dtos.JobExperienceDto;

@RestController
@RequestMapping("/api/job_experiences")
public class JobExperienceController {
	
private JobExperienceService jobExperienceService;
	
	
	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience) {
		
		return this.jobExperienceService.add(jobExperience);
	}
	
	@GetMapping("/getJobExperiencesByUserId")
	public DataResult<List<JobExperienceDto>>getJobExperiencesByUserId(@RequestParam int jobseekerId){
	
		return this.jobExperienceService.getJobExperiencesByUserId(jobseekerId);
	}
	
}
