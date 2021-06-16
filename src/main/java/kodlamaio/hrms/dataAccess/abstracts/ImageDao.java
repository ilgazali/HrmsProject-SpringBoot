package kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.Image;

public interface ImageDao  extends JpaRepository<Image, Integer>{

	@Modifying
	@Query("update Image set imageUrl=:url where cv.id=:cvId")
	int updatePhotoSetPhotoUrlForCv_cvId(@Param("url") String url,@Param("cvId") int cvId);
	

}
