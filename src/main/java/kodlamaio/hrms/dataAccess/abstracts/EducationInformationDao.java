package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.EducationInformation;
import kodlamaio.hrms.entities.dtos.EducationInformationDto;

public interface EducationInformationDao extends JpaRepository<EducationInformation, Integer>{

	/*@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto"
			+ "(a.id, a.releaseDate, e.companyName, j.position, j.description, "
			+ "a.positionAmount, a.minSalary, a.maxSalary, c.cityName,a.applicationDeadline, a.activationStatus) "
			+ "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
			+ "Where a.activationStatus = true  ORDER BY a.applicationDeadline DESC")*/
	
	@Query(value = "Select new kodlamaio.hrms.entities.dtos.EducationInformationDto"
			+ "(j.name, j.surname, u.universityName, d.departmentName, e.startingDate, e.graduationDate) "
			+ "From Cv c Inner Join c.jobseeker j Inner Join c.educationInformations e Inner Join c.educationInformations.university u "
			+ "Inner Join c.educationInformations.universityDepartment d Where c.jobseeker.id = :jobseekerId",nativeQuery = true )
	List<EducationInformationDto> getEducationInformationsByUserId(@Param("jobseekerId") int jobseekerId);
	
	
}
