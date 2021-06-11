package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private int id;
	
	private Date releaseDate;
	
	private String companyName;
	
	private String position;
	
	private String description;
	
	private int positionAmount;
	
	private int minSalary;
	
	private int maxSalary;
	
	private String city;
	
	private Date applicationDeadline;
	
	private boolean activationStatus;
	
	
	
}
