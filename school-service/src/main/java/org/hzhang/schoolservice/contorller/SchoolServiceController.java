package org.hzhang.schoolservice.contorller;

import org.hzhang.studentserviceapi.domain.Student;
import org.hzhang.studentserviceapi.service.StudentServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xm180224 on 12/03/2018.
 */
@RestController
public class SchoolServiceController {
	@Autowired
	StudentServiceFeignClient studentServiceFeignClient;

	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String schoolname) {
		System.out.println("Getting School details for " + schoolname);

		List<Student> students = studentServiceFeignClient.getStudents(schoolname);

		System.out.println("Response Received as " + students);

		return "School Name -  " + schoolname + " \n Student Details " + students;
	}
}

