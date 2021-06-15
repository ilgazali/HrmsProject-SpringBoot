package kodlamaio.hrms.entities.dtos;



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
	
	private String startingDateString;
	
	private String graduationDateString;
	
	
	
}
