package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.EducationInformation;
import kodlamaio.hrms.entities.dtos.EducationInformationDto;

public interface EducationInformationDao extends JpaRepository<EducationInformation, Integer>{


	@Query("Select new kodlamaio.hrms.entities.dtos.EducationInformationDto" 
	      + "(j.name,j.surname,u.universityName,d.departmentName,i.startingDate,i.graduationDate) "
	      + "From Jobseeker j Inner Join j.cvs c Inner Join c.educationInformations i Inner Join i.universityDepartment d Inner Join i.university u"
	      + " Where j.id =:jobseekerId ORDER BY i.startingDate DESC") 
	List<EducationInformationDto> getEducationInformations(@Param("jobseekerId") int jobseekerId);
	
	
}
