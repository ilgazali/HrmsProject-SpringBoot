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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "educations"})
public class CV {

	@Id
	@Column(name = "cv_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@OneToMany(mappedBy = "cv")
    private List<EducationInformation> educationInformations;
	
	/*@ManyToOne
	@JoinColumn(name = "education_id")
	private List<EducationInformation> educationInformation;*/
	

	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperiences;
	
	/*@ManyToOne
	@JoinColumn(name = "job_experience_id")
	private List<JobExperience> jobExperience;*/
	
	

	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguages;
	
	/*@ManyToOne
	@JoinColumn(name = "foreign_language_id")
	private List<ForeignLanguage> foreignLanguage;*/
	
	
	@OneToMany(mappedBy = "cv")
	private List<Image> image;
	
	/*@ManyToOne
	@JoinColumn(name = "image_id")
	private Image image;*/

	
	@OneToMany(mappedBy = "cv")
	private List<SocialMediaAccount> socialMediaAccount;
	
	/*@ManyToOne
	@JoinColumn(name = "social_media_account_id")
	private List<SocialMediaAccount> socialMediaAccount;*/
	
	
	@OneToMany(mappedBy = "cv")
	private List<CVSkill> cvSkills;
	
	/*@ManyToOne
	@JoinColumn(name = "skill_id")
	private List<Skill> skill;*/
	
	
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetters;
	
	/*@ManyToOne
	@JoinColumn(name = "cover_letter_id")
	private CoverLetter coverLetter;*/

	
	@ManyToOne
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "cv")
    private List<Jobseeker> jobseeker;*/
	
	
	
}
