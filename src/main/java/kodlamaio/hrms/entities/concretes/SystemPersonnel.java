package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "system_personnel")
@PrimaryKeyJoinColumn(name="personnel_id",referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnel extends User{
	
	//@Column(name = "personnel_id",insertable = false ,updatable=false)
	//private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;


	
}
