package com.davita.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.davita.school.School;
import com.davita.school.SchoolJPARepo;

@Controller
public class ServiceController {
	
	@Autowired
	SchoolJPARepo repo;
	
	@RequestMapping(path = "/findSchoolsByState/{sname}",produces= {"application/*"})
	@ResponseBody
	public List<School> getSchoolsSorted(@PathVariable("sname") String state ){
		return repo.findByStateSorted(state);
		//return repo.findByState(state);
	}
	
	@RequestMapping(path = "/findSchools",produces= {"application/json"})
	@ResponseBody
	public List<School> getSchools(){
		//return repo.findByStateSorted(State);
		return repo.findByState("TN");
	}

}
