package kodlamaio.hrms.business.abstracts;

public interface EmployerValidityService {
	
	boolean isCompanyNameEmpty(String companyName);
	boolean isWebAddressEmpty(String webAddress);
	boolean isPhoneNumberEmpty(String phoneNumber);
	boolean isPasswordEmpty(String password);
	boolean isPasswordAgainEmpty(String passwordAgain);
	
	boolean emailIsItUsed(String email);
	
}
