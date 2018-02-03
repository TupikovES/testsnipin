package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import snipin.entity.Department;
import snipin.entity.ReportYear;
import snipin.entity.Speciality;
import snipin.entity.Student;
import snipin.repository.QueryRepository;
import snipin.service.DataService;
import snipin.service.QueryService;

import java.util.*;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    @Qualifier("queryService")
    private QueryService service;

    @GetMapping
    public String viewSqlReport(Model model) {

        List<Object[]> reportYears = new ArrayList<>();

        reportYears = service.query(
                "select st.year, d.department_name, count(st.id) as count_students " +
                "from student st join speciality sp inner join department d " +
                "on st.speciality_id = sp.id and sp.department_id = d.id group by st.year, d.id order by st.year"
        );

        model.addAttribute("reportList", reportYears);

        return "report";
    }

}
