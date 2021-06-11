package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UniversityService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UniversityDao;
import kodlamaio.hrms.entities.concretes.University;

@Service
public class UniversityManager implements UniversityService {

	private UniversityDao universityDao;
	
    
	@Autowired
	public UniversityManager(UniversityDao universityDao) {
		super();
		this.universityDao = universityDao;
	}



	@Override
	public Result add(University university) {
		
		this.universityDao.save(university);
		
		return new SuccessResult("Ekleme başarılı");
	}

}
