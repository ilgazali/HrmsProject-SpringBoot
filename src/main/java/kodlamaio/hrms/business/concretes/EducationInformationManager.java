package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationInformationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationInformationDao;
import kodlamaio.hrms.entities.concretes.EducationInformation;

@Service
public class EducationInformationManager implements EducationInformationService{

	private EducationInformationDao educationInformationDao;
	
	
	
	@Autowired
	public EducationInformationManager(EducationInformationDao educationInformationDao) {
		super();
		this.educationInformationDao = educationInformationDao;
	}




	@Override
	public Result add(EducationInformation educationInformation) {
		
		this.educationInformationDao.save(educationInformation);
		
		return new SuccessResult("Ekleme başarılı");
	}

}
