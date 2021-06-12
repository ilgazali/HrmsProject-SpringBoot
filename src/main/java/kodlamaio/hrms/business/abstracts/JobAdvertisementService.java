package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {

	 DataResult<List<JobAdvertisement>> getAll();
	
	 DataResult<List<JobAdvertisementDto>> getAllActive();
	 
	 DataResult<List<JobAdvertisementDto>> getAllActiveSorted();

	 DataResult<List<JobAdvertisementDto>> getAllActiveByCompanyName(String companyName);
	 
	 
	 Result add(JobAdvertisement jobAdvertisement);
	 
	 Result closeTheAdvertisement(int jobAdvertisementId);
	
}
