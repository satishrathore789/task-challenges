package com.beyondtalent.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beyondtalent.model.PersonalInfo;

@Repository
public interface FindContantRepogitory extends JpaRepository<PersonalInfo, Long> {

	List<PersonalInfo> findByFirstNameContaining(String searchTxt);

	List<PersonalInfo> findByLastNameContaining(String searchTxt);

	/// @Query("SELECT u.firstName FROM PersonalInfo u INNER JOIN Skills a ON
	/// a.skillId = u.personalId WHERE a.skills = :searchTxtz")
	/// List<Skills> findBySkillContaining(@Param("searchTxt") String searchTxt);

	// public List<PersonalInfo> findByFirstnameContaining(String search);

	@Query("SELECT p.firstName , s.skills,e.degree FROM PersonalInfo p join p.setSkills s join p.listEducation e  WHERE s.skills  LIKE CONCAT('%',:searchTxt,'%') or p.firstName LIKE CONCAT('%',:searchTxt,'%') or e.degree LIKE CONCAT('%',:searchTxt,'%')")
	public List<Object[]> findByContain(@Param("searchTxt") String searchTxt);

	// public List <PersonalInfo> findByFirstnameIgnoreCase(String searchTxt);

}
