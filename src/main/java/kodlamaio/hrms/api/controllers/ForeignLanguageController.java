package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreign_languages")
public class ForeignLanguageController {
	
private ForeignLanguageService foreignLanguageService;
	
	
	@Autowired
	public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		
		return this.foreignLanguageService.add(foreignLanguage);
	}
	
	
}
