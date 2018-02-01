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
import snipin.service.DataService;

import java.util.*;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    @Qualifier("studentService")
    private DataService<Student> studentService;

    @Autowired
    @Qualifier("specialityService")
    private DataService<Speciality> specialityService;

    @Autowired
    @Qualifier("departmentService")
    private DataService<Department> departmentService;

    @GetMapping
    public String viewReport(Model model) {

        List<Student> students = studentService.getAll();
        SortedSet<Integer> years = new TreeSet<>();

        for (Student st : students) {
            years.add(st.getYear());
        }
        List<Speciality> specialities = specialityService.getAll();
        List<Department> departments = departmentService.getAll();

        List<ReportYear> reportYears = new ArrayList<>();

        for (int year : years) {
            for (Department d : departments) {
                int count = 0;
                for (Student student : students) {
                    if (student.getYear() == year & student.getSpeciality().getDepartment().equals(d)) {
                        count++;
                    }
                }
                reportYears.add(new ReportYear(year, d.getName(), count));
            }
        }

        model.addAttribute("reportList", reportYears);

        return "report";
    }

}
