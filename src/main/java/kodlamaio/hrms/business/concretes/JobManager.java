package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.business.abstracts.JobValidityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;


@Service
public class JobManager implements JobService{
	
	private JobDao jobDao;
	private JobValidityService jobValidityService;
	

	
    @Autowired	
	public JobManager(JobDao jobDao, JobValidityService jobValidityService) {
		super();
		this.jobDao = jobDao;
		this.jobValidityService = jobValidityService;
	}



	@Override
	public DataResult<List<Job>> getAll() {
	
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Data başarılı bir şekilde listelendi.");
	}



	@Override
	public Result add(Job job) {
		
		if (
				(!jobValidityService.isPositionEmpty(job.getPosition()))&&
				(!jobValidityService.isDescriptionEmpty(job.getDescription()))&&		
				(!jobValidityService.isPositionAlreadyAvailable(job.getPosition()))	) {
			
			this.jobDao.save(job);
			return new SuccessResult("Ekleme başarılı!");
			
		}		
		return new ErrorResult("Ekleme Başarısız!");
	}
	
	

}
