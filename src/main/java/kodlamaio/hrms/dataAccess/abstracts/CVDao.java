package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.CV;


public interface CVDao extends JpaRepository<CV, Integer>{
	
	List<CV> getByJobseeker_Id(int jobseekerId);
	
}
