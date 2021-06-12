package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto"
			+ "(a.id, a.releaseDate, e.companyName, j.position, j.description, "
			+ "a.positionAmount, a.minSalary, a.maxSalary, c.cityName,a.applicationDeadline, a.activationStatus) "
			+ "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
			+ "Where a.activationStatus = true")
	List<JobAdvertisementDto> getAllActive();
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto"
			+ "(a.id, a.releaseDate, e.companyName, j.position, j.description, "
			+ "a.positionAmount, a.minSalary, a.maxSalary, c.cityName,a.applicationDeadline, a.activationStatus) "
			+ "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
			+ "Where a.activationStatus = true  ORDER BY a.applicationDeadline DESC")
	List<JobAdvertisementDto> getAllActiveSorted(); //Sadece aktif iş ilanlarını son başvuru tarihine göre sıralar.

	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto"
			+ "(a.id, a.releaseDate, e.companyName, j.position, j.description, "
			+ "a.positionAmount, a.minSalary, a.maxSalary, c.cityName,a.applicationDeadline, a.activationStatus) "
			+ "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
			+ "Where e.companyName = :companyName and a.activationStatus = true ")
	List<JobAdvertisementDto> getAllActiveByCompanyName(@Param("companyName") String companyName); //Seçilen bir şirkete ait tüm aktif ilanlar için.
			


	@Modifying
	@Query("update JobAdvertisement set activationStatus=false where id = :jobAdvertisementId")
	void closeTheAdvertisement(@Param("jobAdvertisementId") int jobAdvertisementId); //İş ilanını kapatmak için
	
}
