package kodlamaio.hrms.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerValidityService;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public class JobseekerValidityManager implements JobseekerValidityService{

	private JobseekerDao jobseekerDao;

	
	@Autowired
	public JobseekerValidityManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}

	@Override
	public boolean emailIsItUsed(String email) {
		for(Jobseeker jobseeker : jobseekerDao.findAll()) {
			if(email.equals(jobseeker.getEmail())) {
				System.out.println("WARNING: bu e-mail'e kayıtlı bir hesap vardır");
				return false;
			}
		}
		return true;
	}
	

	@Override
	public boolean nationalityIdIsItUsed(String nationalityId) {
		
		for(Jobseeker jobseeker : jobseekerDao.findAll()) {
			if(nationalityId.equals(jobseeker.getIdentityNumber())) {
				System.out.println("WARNING: bu Tc No'ya kayıtlı bir hesap vardır");

				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isNameEmpty(String name) {
		
		if(name.isEmpty()){
			
			System.out.println("WARNING: you must enter your name");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
		
	}
		

	@Override
	public boolean isSurnameEmpty(String surname) {
        
		if(surname.isEmpty()){
			
			System.out.println("WARNING: you must enter your surname");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isBirthYearEmpty(int birthYear) {
      if(String.valueOf(birthYear).isEmpty()){
			
			System.out.println("WARNING: you must enter your birth year");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isNationalityIdEmpty(String nationalityId) {
        
		if(nationalityId.isEmpty()){
			
			System.out.println("WARNING: you must enter your nationality id");
			
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
			
			System.out.println("WARNING: you must enter again your password");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

}
