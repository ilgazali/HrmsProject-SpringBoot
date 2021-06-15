package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.dtos.JobExperienceDto;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		
		if (jobExperience.getEndDateOfWork().trim().isBlank()){
			jobExperience.setEndDateOfWork("Devam ediyor.");
		}
		
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Ekleme başarılı");
	}

	@Override
	public DataResult<List<JobExperienceDto>> getJobExperiencesByUserId(int jobseekerId) {
		
		return new SuccessDataResult<List<JobExperienceDto>>(this.jobExperienceDao.getJobExperiences(jobseekerId));
		
	}
	
	
	
	
}
