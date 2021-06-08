package kodlamaio.hrms.business.abstracts;

public interface JobValidityService {

	boolean isPositionEmpty(String position);
	boolean isDescriptionEmpty(String description);
	boolean isPositionAlreadyAvailable(String position);
	
}
