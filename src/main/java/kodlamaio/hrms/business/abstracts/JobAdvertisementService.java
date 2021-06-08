package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	 DataResult<List<JobAdvertisement>> getAll();
	
	 DataResult<List<JobAdvertisement>> getAllActive();
	 
	 DataResult<List<JobAdvertisement>> getAllActiveSorted();

	 DataResult<List<JobAdvertisement>> getAllActiveByCompanyName(String companyName);
	 
	 
	 Result add(JobAdvertisement jobAdvertisement);
	 
	 Result closeTheAdvertisement(int jobAdvertisementId);
	
}
