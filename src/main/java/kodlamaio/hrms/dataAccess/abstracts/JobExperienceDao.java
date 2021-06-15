package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.dtos.JobExperienceDto;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

	@Query("Select new kodlamaio.hrms.entities.dtos.JobExperienceDto"
			+ "(j.name,j.surname,e.workplaceName,e.jobPosition,e.startDateOfWork,e.endDateOfWork) "
			+ "From Jobseeker j Inner Join j.cvs c Inner Join c.jobExperiences e "
			+ "Where j.id =:jobseekerId ORDER BY e.startDateOfWork DESC")
	List<JobExperienceDto> getJobExperiences(@Param("jobseekerId") int jobseekerId);
	
}
