package kodlamaio.hrms.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobValidityService;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;

@Service
public class JobValidityManager implements JobValidityService{

	private JobDao jobDao;
	
	
	@Autowired
	public JobValidityManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public boolean isPositionEmpty(String position) {
		
		if(position.isEmpty()){
					
					System.out.println("WARNING: you must enter the position name");
					
				return true;
				
			    }else {
			    	
				return false;
				
	          }
	}

	@Override
	public boolean isDescriptionEmpty(String description) {
		if(description.isEmpty()){
			
			System.out.println("WARNING: you must enter the description");
			
		return true;
		
	    }else {
	    	
		return false;
		
      }
	}


	@Override
	public boolean isPositionAlreadyAvailable(String position) {
	
		for(Job job : jobDao.findAll()) {
			
			if (position.equals(job.getPosition())){
				
				System.out.println("WARNING: Bu iş pozisyonu zaten mevcut");
				return true;
			}		
		}
		return false;
	}

}
