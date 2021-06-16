package kodlamaio.hrms.api.controllers;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	
private ImageService imageService;
	
	
	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}


	@GetMapping("/getAll")
	public DataResult<Image> getAll(){
		return null;
	}
	
	@PostMapping("/imageAdd")
	public ResponseEntity<?> upload(@ModelAttribute("image") Image image,@RequestParam("multipartFile") MultipartFile multipartFile) throws IOException{
		return new ResponseEntity<>(this.imageService.add(image, multipartFile), HttpStatus.OK);
	}
	
	@PostMapping("/imageUpdate")
	@Transactional
	public ResponseEntity<?> update(int cvId, MultipartFile multipartFile) throws IOException{
		return new ResponseEntity<>(this.imageService.update(cvId, multipartFile), HttpStatus.OK);
	}
	
	
}
