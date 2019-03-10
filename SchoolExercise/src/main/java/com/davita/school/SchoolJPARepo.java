package com.davita.school;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.davita.school.School;

public interface SchoolJPARepo extends JpaRepository<School, String>{
	
	@Query("from School where State=?1 order by SCHOOLID")
	List<School> findByStateSorted(String state);
	
	List<School> findByState(String state);

}
