package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CVSkillService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CVSkill;

@RestController
@RequestMapping("/api/cv_skills")
public class CVSkillController {

	private CVSkillService cvSkillService;
	
	@Autowired
	public CVSkillController(CVSkillService cvSkillService) {
		super();
		this.cvSkillService = cvSkillService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody CVSkill cvSkill) {
		
		return this.cvSkillService.add(cvSkill);
	}
}

	
	
	
	

	