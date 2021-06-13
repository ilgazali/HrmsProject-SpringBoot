package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "educations")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvs"})
public class EducationInformation {
	
	@Id
	@Column(name = "education_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "starting_date")
	private String startingDate;
	
	@Nullable
	@Column(name = "graduation_date")
	private String graduationDate;

	@ManyToOne()
	@JoinColumn(name = "university_id")
	private University university;
	
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private UniversityDepartment universityDepartment;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CV cv;
}
