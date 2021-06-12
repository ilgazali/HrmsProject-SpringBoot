package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "jobseekers")
@PrimaryKeyJoinColumn(name="jobseeker_id",referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Jobseeker extends User {

	
	@Column(name = "jobseeker_id",insertable = false ,updatable=false)
	private int jobseekerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "year_of_birth")
    private int birthYear;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CV cv;
	

    
}
