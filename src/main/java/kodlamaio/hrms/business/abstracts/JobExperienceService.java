package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	Result add(JobExperience jobExperience);
}
