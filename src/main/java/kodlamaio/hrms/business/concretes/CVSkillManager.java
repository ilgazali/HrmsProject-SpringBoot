package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CVSkillService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CVSkillDao;
import kodlamaio.hrms.entities.concretes.CVSkill;

@Service
public class CVSkillManager implements CVSkillService{

	private CVSkillDao cvSkillDao;

	@Autowired
	public CVSkillManager(CVSkillDao cvSkillDao) {
		super();
		this.cvSkillDao = cvSkillDao;
	}

	@Override
	public Result add(CVSkill cvSkill) {
		this.cvSkillDao.save(cvSkill);
		return new SuccessResult("skill ekleme Başarılı");
	}
	
	
	
	
}
