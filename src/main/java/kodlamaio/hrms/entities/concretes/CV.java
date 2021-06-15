package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CV {

	@Id
	@Column(name = "cv_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
    private List<EducationInformation> educationInformations;
	
	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperiences;
	
	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguages;
	
	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Image> image;


	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<SocialMediaAccount> socialMediaAccount;
	

	
	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CVSkill> cvSkills;
	

	
	//@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetters;
	

	
	@ManyToOne
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	

	
	
	
}
