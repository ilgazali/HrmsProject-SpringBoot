package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CVSkill;

public interface CVSkillDao extends JpaRepository<CVSkill, Integer> {

}
