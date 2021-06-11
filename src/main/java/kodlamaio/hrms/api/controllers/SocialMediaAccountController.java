package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialMediaAccountService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

@RestController
@RequestMapping("/api/social_media_accounts")
public class SocialMediaAccountController {
	
private SocialMediaAccountService socialMediaAccountService;
	
	
	@Autowired
	public SocialMediaAccountController(SocialMediaAccountService socialMediaAccountService) {
		super();
		this.socialMediaAccountService = socialMediaAccountService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody SocialMediaAccount socialMediaAccount) {
		
		return this.socialMediaAccountService.add(socialMediaAccount);
	}
}
