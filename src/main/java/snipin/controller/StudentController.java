package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import snipin.entity.Department;
import snipin.entity.Student;
import snipin.service.DataService;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private DataService<Student> studentService;

    @Autowired
    @Qualifier("departmentService")
    private DataService<Department> departmentService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewStudents(Model model) {
        model.addAttribute("title", "Студенты");
        model.addAttribute("students", studentService.getAll());

        return "students";
    }

}
