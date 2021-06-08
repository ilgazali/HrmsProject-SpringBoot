package kodlamaio.hrms.business.abstracts;

public interface JobseekerValidityService {

	boolean isNameEmpty(String name);
	boolean isSurnameEmpty(String surname);
	boolean isBirthYearEmpty(int birthYear);
	boolean isNationalityIdEmpty(String nationalityId);
	boolean isPasswordEmpty(String password);
	boolean isPasswordAgainEmpty(String passwordAgain);
	
	boolean emailIsItUsed(String email);
	boolean nationalityIdIsItUsed(String nationalityId);
	
	
}
