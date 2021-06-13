package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "social_media_accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvs"})
public class SocialMediaAccount {

	@Id
	@Column(name = "social_media_account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "social_media_name")
	private String socialMediaName;
	
	@Column(name = "social_media_link")
	private String socialMediaLink;
	
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CV cv;
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "socialMediaAccount")
    private List<CV> cvs;*/
	
}
