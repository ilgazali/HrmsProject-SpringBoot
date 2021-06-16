package kodlamaio.hrms.core.abstracts;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
	
    public Map imageUpload(MultipartFile multipartFile) throws IOException;

	
	public File convert(MultipartFile multipartFile) throws IOException;

}
