package kodlamaio.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.JobseekerValidityService;
import kodlamaio.hrms.core.abstracts.EmailCheckService;
import kodlamaio.hrms.core.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.abstracts.JobseekerCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private JobseekerCheckService jobseekerCheckService;
	private JobseekerValidityService jobseekerValidityService;
	private EmailCheckService emailCheckService;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, JobseekerCheckService jobseekerCheckService,
			JobseekerValidityService jobseekerValidityService, EmailCheckService emailCheckService,
			EmailVerificationService emailVerificationService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.jobseekerCheckService = jobseekerCheckService;
		this.jobseekerValidityService = jobseekerValidityService;
		this.emailCheckService = emailCheckService;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public Result register(Jobseeker jobseeker) throws NumberFormatException, RemoteException {
	
		if (
				(!jobseekerValidityService.isNameEmpty(jobseeker.getName()))&&
				(!jobseekerValidityService.isSurnameEmpty(jobseeker.getSurname()))&&
				(!jobseekerValidityService.isNationalityIdEmpty(jobseeker.getIdentityNumber()))&&
				(!jobseekerValidityService.isBirthYearEmpty(jobseeker.getBirthYear()))&&
				(!jobseekerValidityService.isPasswordEmpty(jobseeker.getPassword()))&&
				(!jobseekerValidityService.isPasswordAgainEmpty(jobseeker.getPasswordAgain()))&&			
			jobseekerCheckService.checkIfRealPerson(jobseeker)&&
			emailCheckService.isEmailAdressValid(jobseeker.getEmail())&&
			jobseekerValidityService.emailIsItUsed(jobseeker.getEmail())&&
			jobseekerValidityService.nationalityIdIsItUsed(jobseeker.getIdentityNumber())&&
			Objects.equal(jobseeker.getPassword(), jobseeker.getPasswordAgain())){
			
			emailVerificationService.sendVerificationMail(jobseeker.getEmail());
			
			this.jobseekerDao.save(jobseeker);
			
			return new SuccessResult("Kayıt başarılı! Lütfen e-mail adresinize gönderilen kodu onaylayınız.");
			
		}else {
			
		    return new ErrorResult("Kayıt başarısız!");

		}
	
	}
	
	@Override
	public DataResult<List<Jobseeker>> getAll() {

		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll(),"Data başarılı bir şekilde listelendi.");
	}
	
}
