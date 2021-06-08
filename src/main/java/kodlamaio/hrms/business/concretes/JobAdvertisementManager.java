package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"Listeleme başarılı.");
	}




	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		jobAdvertisementDao.save(jobAdvertisement);
		
		return new SuccessResult("Başarılı");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveSorted() {
			

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActiveSorted(),"Sıralama başarılı!");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveByCompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getAllActiveByCompanyName(companyName),"Şirket adına göre sıralama başarılı!");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAllActive() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActive(),"Aktif iş ilanları sıralaması başarılı!");
	}




	@Override
	public Result closeTheAdvertisement(int jobAdvertisementId) {
		
		jobAdvertisementDao.closeTheAdvertisement(jobAdvertisementId);
		
		return new SuccessResult("İlan kapatıldı");
	}





	

}
