package kodlamaio.hrms.core.concretes;

import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import kodlamaio.hrms.core.abstracts.EmailDomainCheckService;

@Service
public class EmailDomainCheckManager implements EmailDomainCheckService{

	@Override
	public boolean isEmailAndDomainNameSame(String website, String email) {
		
		boolean result = false;
		
		String[] domain = website.split("\\.");
		String[] e_mail = email.split("@|\\.");
		
		if (Objects.equal(e_mail[1], domain[1])) {
			result = true;
		}
		System.out.println("WARNING: Domain adınız ve mail adresiniz aynı olmalı! ");
		return result;
	}

}
