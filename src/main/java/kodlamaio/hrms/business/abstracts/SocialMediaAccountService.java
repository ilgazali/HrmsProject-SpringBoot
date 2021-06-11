package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

public interface SocialMediaAccountService {
	Result add(SocialMediaAccount socialMediaAccount);
}
