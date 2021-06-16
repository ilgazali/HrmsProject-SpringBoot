package kodlamaio.hrms.cloudinaryService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Service
public class CloudinaryManager {
	
	Cloudinary cloudinary;

	private Map<String, String> valuesMap = new HashMap<>();

	@Autowired
	public CloudinaryManager() {
		valuesMap.put("cloud_name", "dbnxgtv9w");
		valuesMap.put("api_key", "395977436781492");
		valuesMap.put("api_secret", "rxe-UzBYScUmGg8xqEwy0n8nTFs");
		cloudinary = new Cloudinary(valuesMap);

	}

	public Map upload(MultipartFile multipartFile) throws IOException {
		File file = convert(multipartFile);
		Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		file.delete();
		return result;
	}


	public File convert(MultipartFile multipartFile) throws IOException {
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(multipartFile.getBytes());
		fo.close();
		return file;

	}
}
