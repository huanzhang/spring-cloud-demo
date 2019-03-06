package org.hzhang.studentserviceapi.service;

import org.hzhang.studentserviceapi.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by xm180224 on 12/03/2018.
 */
public interface StudentService {

    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET, produces = "application/json")
    List<Student> getStudents(@PathVariable("schoolname") String schoolname);
}
