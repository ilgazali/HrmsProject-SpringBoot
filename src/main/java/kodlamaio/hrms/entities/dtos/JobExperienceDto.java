package kodlamaio.hrms.entities.dtos;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperienceDto {

		private String nameString;
			
		private String surnameString;
		
		private String workplaceNameString;
		
		private String jobPositionString;
		
		private Date startDateOfWorkString;
		
		private String endDateOfWorkString;
			
	
}
