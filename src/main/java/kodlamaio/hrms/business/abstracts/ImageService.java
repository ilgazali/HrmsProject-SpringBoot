package kodlamaio.hrms.business.abstracts;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	
    public Result add(Image image, MultipartFile multipartFile) throws IOException;
	
	public Result update(int cvId, MultipartFile multipartFile) throws IOException;
	
	
}
