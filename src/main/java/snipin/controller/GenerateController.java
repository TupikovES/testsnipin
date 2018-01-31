package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import snipin.entity.Department;
import snipin.service.DataService;
import snipin.util.GenerateData;

import java.util.List;

@Controller
@RequestMapping("/generate")
public class GenerateController {

    @Autowired
    @Qualifier("departmentService")
    private DataService<Department> departmentService;

    @Autowired
    @Qualifier("generateData")
    private GenerateData generateData;

    @GetMapping
    public String generate(Model model) {
        List<Department> departments = departmentService.getAll();
        if (departments.isEmpty()) {

            generateData.generate(20);

            return "redirect:/";

        } else {
            model.addAttribute("message", "Данные уже есть!");
            return "generate";
        }
    }

}
