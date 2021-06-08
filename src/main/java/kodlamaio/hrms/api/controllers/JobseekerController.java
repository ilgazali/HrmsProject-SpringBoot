package kodlamaio.hrms.api.controllers;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekerController {

	private JobseekerService jobseekerService;

	@Autowired
	public JobseekerController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}
	
	
	@PostMapping("/register")
	public Result register(@RequestBody Jobseeker jobseeker) throws NumberFormatException, RemoteException {
		
		return this.jobseekerService.register(jobseeker);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll(){
		
      return this.jobseekerService.getAll();
	}
	
	
}
