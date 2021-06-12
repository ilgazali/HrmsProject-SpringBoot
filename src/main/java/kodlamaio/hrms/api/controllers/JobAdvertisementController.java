package kodlamaio.hrms.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;


@RestController
@RequestMapping("/api/job_advertisements")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		
      return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getAllActive")
	public DataResult<List<JobAdvertisementDto>> getAllActive(){
		
		return this.jobAdvertisementService.getAllActive();
	}
	
	@GetMapping("/getAllActiveSorted")
	public DataResult<List<JobAdvertisementDto>> getByActivationStatus(){
		
      return this.jobAdvertisementService.getAllActiveSorted();
	}
	
	@GetMapping("/getAllActiveByCompanyName")
	public DataResult<List<JobAdvertisementDto>> getAllActiveByCompanyName(@RequestParam String companyName){
		
		return this.jobAdvertisementService.getAllActiveByCompanyName(companyName);
	}
	
	@PostMapping("/closeTheAdvertisement")
	@Transactional
	public Result closeTheAdvertisement(@RequestParam int jobAdvertisementId) {
		return this.jobAdvertisementService.closeTheAdvertisement(jobAdvertisementId);
	}
}
