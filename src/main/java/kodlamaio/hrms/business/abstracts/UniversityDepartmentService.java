package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.UniversityDepartment;

public interface UniversityDepartmentService {
	Result add(UniversityDepartment universityDepartment);
}
