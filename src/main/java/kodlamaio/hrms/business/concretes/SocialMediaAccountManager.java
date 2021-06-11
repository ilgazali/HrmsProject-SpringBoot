package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialMediaAccountService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaAccountDao;
import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

@Service
public class SocialMediaAccountManager implements SocialMediaAccountService {

	private SocialMediaAccountDao socialMediaAccountDao;
	
	
	@Autowired
	public SocialMediaAccountManager(SocialMediaAccountDao socialMediaAccountDao) {
		super();
		this.socialMediaAccountDao = socialMediaAccountDao;
	}



	@Override
	public Result add(SocialMediaAccount socialMediaAccount) {

		this.socialMediaAccountDao.save(socialMediaAccount);
		
		return new SuccessResult("Ekleme başarılı");
	}

	
}
