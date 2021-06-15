package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationInformation;
import kodlamaio.hrms.entities.dtos.EducationInformationDto;

public interface EducationInformationService {

	
	Result add(EducationInformation educationInformation);
	
	DataResult<List<EducationInformationDto>> getEducationInformationsByUserId(int jobseekerId);
}
