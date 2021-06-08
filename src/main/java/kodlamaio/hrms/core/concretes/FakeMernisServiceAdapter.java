package kodlamaio.hrms.core.concretes;

import java.rmi.RemoteException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.JobseekerCheckService;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Component
@Primary
public class FakeMernisServiceAdapter implements JobseekerCheckService{

	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) throws NumberFormatException, RemoteException {
		
		return true;
	}

}
