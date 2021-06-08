package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerValidityService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerValidityManager implements EmployerValidityService {

	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerValidityManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public boolean isCompanyNameEmpty(String companyName) {
         if(companyName.isEmpty()){
			
			System.out.println("WARNING: you must enter your company name");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isWebAddressEmpty(String webAddress) {
if(webAddress.isEmpty()){
			
			System.out.println("WARNING: you must enter your web address");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPhoneNumberEmpty(String phoneNumber) {
if(phoneNumber.isEmpty()){
			
			System.out.println("WARNING: you must enter your phone number");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPasswordEmpty(String password) {
if(password.isEmpty()){
			
			System.out.println("WARNING: you must enter your password");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPasswordAgainEmpty(String passwordAgain) {
if(passwordAgain.isEmpty()){
			
			System.out.println("WARNING: you must enter again your company password");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean emailIsItUsed(String email) {
		
		for(Employer employer : employerDao.findAll()) {
			if(email.equals(employer.getEmail())) {
				System.out.println("WARNING: bu e-mail'e kayıtlı bir hesap vardır");
				return false;
			}
		}
		return true;
	}

}
