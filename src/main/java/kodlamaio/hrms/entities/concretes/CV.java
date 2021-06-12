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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CV {

	@Id
	@Column(name = "cv_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "education_id")
	private EducationInformation educationInformation;
	
	@ManyToOne
	@JoinColumn(name = "job_experience_id")
	private JobExperience jobExperience;
	
	@ManyToOne
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;
	
	@ManyToOne
	@JoinColumn(name = "image_id")
	private Image image;
	
	@ManyToOne
	@JoinColumn(name = "social_media_account_id")
	private SocialMediaAccount socialMediaAccount;
	
	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name = "cover_letter_id")
	private CoverLetter coverLetter;

	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
    private List<Jobseeker> jobseeker;
	
	
	
}
