package kodlamaio.hrms.entities.dtos;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationInformationDto {
	
	private String nameString;
	
	private String surnameString;
	
	private String universityString;
	
	private String universityDepartmentString;
	
	private Date startingDateString;
	
	private String graduationDateString;
	
	
	
}
