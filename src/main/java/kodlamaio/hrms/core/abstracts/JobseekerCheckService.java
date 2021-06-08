package kodlamaio.hrms.core.abstracts;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public interface JobseekerCheckService {
	
	 boolean checkIfRealPerson(Jobseeker jobseeker) throws NumberFormatException, RemoteException;
	 
}
