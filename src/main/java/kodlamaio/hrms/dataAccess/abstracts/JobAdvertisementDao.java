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
			+ "(jb.id,jb.releaseDate, e.companyName, j.position,j.description,"
			+ "jb.positionAmount,jb.minSalary,jb.maxSalary,c.cityName, jb.applicationDeadline,jb.activationStatus)"
			+ "From Job j Inner Join j.jobAdvertisements jb Inner Join Employer e Inner Join City c"
			+ " where jb.activationStatus = true")//Aktif olan iş ilanlarını sıralar.
	List<JobAdvertisementDto> getAllActive();
	
	//@Query("From JobAdvertisement where activationStatus = true")//Aktif olan iş ilanlarını sıralar.
	//List<JobAdvertisementDto> getAllActive();
	
	@Query("From JobAdvertisement where activationStatus = true ORDER BY applicationDeadline DESC") //Sadece aktif iş ilanlarını son başvuru tarihine göre sıralar.
	List<JobAdvertisement> getAllActiveSorted();
	
	@Query("From JobAdvertisement where  employer.companyName = :companyName and activationStatus = true") //Seçilen bir şirkete ait tüm aktif ilanlar için.
	List<JobAdvertisement> getAllActiveByCompanyName(@Param("companyName") String companyName);

	@Modifying
	@Query("update JobAdvertisement set activationStatus=false where id = :jobAdvertisementId")//İş ilanını kapanmak için
	void closeTheAdvertisement(@Param("jobAdvertisementId") int jobAdvertisementId);
	
}
