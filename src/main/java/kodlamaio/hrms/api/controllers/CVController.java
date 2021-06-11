package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CVService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CV;

@RestController
@RequestMapping("/api/cvs")
public class CVController {

private CVService cvService;
	
	
	@Autowired
	public CVController(CVService cvService) {
		super();
		this.cvService = cvService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody CV cv) {
		
		return this.cvService.add(cv);
	}
	
}
