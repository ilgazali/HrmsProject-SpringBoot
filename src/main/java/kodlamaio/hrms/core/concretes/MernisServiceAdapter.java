package kodlamaio.hrms.core.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.JobseekerCheckService;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter implements JobseekerCheckService{


	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) throws NumberFormatException, RemoteException{
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(jobseeker.getIdentityNumber()),
				jobseeker.getName().toUpperCase(), jobseeker.getSurname().toUpperCase(),
				jobseeker.getBirthYear());
	}

}
