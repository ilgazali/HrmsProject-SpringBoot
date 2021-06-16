package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CVDao;
import kodlamaio.hrms.entities.concretes.CV;


@Service
public class CVManager implements CVService{

	private CVDao cvDao;
	
	
	@Autowired
	public CVManager(CVDao cvDao) {
		super();
		this.cvDao = cvDao;
	}



	@Override
	public Result add(CV cv) {
		
		this.cvDao.save(cv);
		
		return new SuccessResult("Ekleme başarılı");
	
	}



	@Override
	public DataResult<List<CV>> getCVByJobseekerId(int jobseekerId) {

		return new SuccessDataResult<List<CV>>(this.cvDao.getByJobseeker_Id(jobseekerId),"Veri başarılı bir şekilde getirildi.");
	}

}
