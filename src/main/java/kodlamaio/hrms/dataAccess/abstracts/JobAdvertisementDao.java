package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where activationStatus = true")//Aktif olan iş ilanlarını sıralar.
	List<JobAdvertisement> getAllActive();
	
	@Query("From JobAdvertisement where activationStatus = true ORDER BY applicationDeadline DESC") //Sadece aktif iş ilanlarını son başvuru tarihine göre sıralar.
	List<JobAdvertisement> getAllActiveSorted();
	
	@Query("From JobAdvertisement where  employer.companyName = :companyName and activationStatus = true") //Seçilen bir şirkete ait tüm aktif ilanlar için.
	List<JobAdvertisement> getAllActiveByCompanyName(@Param("companyName") String companyName);

	
	@Modifying
	@Query("update JobAdvertisement set activationStatus=false where id = :jobAdvertisementId")//İş ilanını kapanmak için
	void closeTheAdvertisement(@Param("jobAdvertisementId") int jobAdvertisementId);
	
}
