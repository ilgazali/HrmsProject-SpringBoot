package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UniversityDepartmentService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UniversityDepartmentDao;
import kodlamaio.hrms.entities.concretes.UniversityDepartment;

@Service
public class UniversityDepartmentManager implements UniversityDepartmentService{

	private UniversityDepartmentDao universityDepartmentDao;
	
	
	@Autowired
	public UniversityDepartmentManager(UniversityDepartmentDao universityDepartmentDao) {
		super();
		this.universityDepartmentDao = universityDepartmentDao;
	}





	@Override
	public Result add(UniversityDepartment universityDepartment) {
this.universityDepartmentDao.save(universityDepartment);
return new SuccessResult("Ekleme başarılı");
	}

}
