package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import snipin.entity.Department;
import snipin.service.DataService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    @Qualifier("departmentService")
    private DataService<Department> departmentService;

    @GetMapping
    public String viewDepartments(Model model) {
        model.addAttribute("title", "Факультеты");
        model.addAttribute("departments", departmentService.getAll());

        return "departments";
    }

}
