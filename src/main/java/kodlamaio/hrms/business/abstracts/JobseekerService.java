package kodlamaio.hrms.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {

	 Result register(Jobseeker jobseeker) throws NumberFormatException, RemoteException;
	 DataResult<List<Jobseeker>> getAll();
}
