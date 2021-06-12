package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.CV;


public interface CVDao extends JpaRepository<CV, Integer>{
	//From JobAdvertisement where  employer.companyName = :companyName and activationStatus = true"
	//@Query(value = "From CV  Where CV.jobseeker.jobseekerId =:jobseekerId", nativeQuery = true)
	//List<CV> getCVByJobseekerId(@Param("jobseekerId") int jobseekerId);
	
	List<CV> getByJobseeker_JobseekerId(int jobseekerId);
}
