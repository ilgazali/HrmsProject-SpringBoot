package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.EmployerValidityService;
import kodlamaio.hrms.core.abstracts.EmailCheckService;
import kodlamaio.hrms.core.abstracts.EmailDomainCheckService;
import kodlamaio.hrms.core.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
private EmployerDao employerDao;
private EmployerValidityService employerValidityService;
private EmailCheckService emailCheckService;	
private EmailVerificationService emailVerificationService;
private EmailDomainCheckService emailDomainCheckService;
	
    @Autowired
	public EmployerManager(EmployerDao employerDao, EmployerValidityService employerValidityService,
		EmailCheckService emailCheckService, EmailVerificationService emailVerificationService,
		EmailDomainCheckService emailDomainCheckService) {
	super();
	this.employerDao = employerDao;
	this.employerValidityService = employerValidityService;
	this.emailCheckService = emailCheckService;
	this.emailVerificationService = emailVerificationService;
	this.emailDomainCheckService = emailDomainCheckService;
}

	
	@Override
	public Result register(Employer employer) {
		
		if (
			(!employerValidityService.isCompanyNameEmpty(employer.getCompanyName()))&&
			(!employerValidityService.isPhoneNumberEmpty(employer.getPassword()))&&
			(!employerValidityService.isWebAddressEmpty(employer.getWebAddress()))&&
			(!employerValidityService.isPasswordEmpty(employer.getPassword()))&&
			(!employerValidityService.isPasswordAgainEmpty(employer.getPasswordAgain()))&&
			
			employerValidityService.emailIsItUsed(employer.getEmail())&&
			emailCheckService.isEmailAdressValid(employer.getEmail())&&
			emailDomainCheckService.isEmailAndDomainNameSame(employer.getWebAddress(), employer.getEmail())&&
			
			Objects.equal(employer.getPassword(), employer.getPasswordAgain())){
			
			emailVerificationService.sendVerificationMail(employer.getEmail());
			employer.setVerificationStatus(false);//Default --> Sistem personeli onaylayınca true olacaktır.
			
			this.employerDao.save(employer);
			
			return new SuccessResult("Kayıt Başarılı! Lütfen e-mail adresinize gönderilen kodu onaylayınız");
			
		}else {
			return new ErrorResult("Kayıt Başarısız");
		}
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data başarılı bir şekilde listelendi.");
	}

}
