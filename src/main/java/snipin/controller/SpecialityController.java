package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import snipin.entity.Speciality;
import snipin.service.DataService;

@Controller
@RequestMapping("/specialities")
public class SpecialityController {

    @Autowired
    @Qualifier("specialityService")
    private DataService<Speciality> specialityService;

    @GetMapping
    public String viewSpecialities(Model model) {
        model.addAttribute("title", "Специальности");
        model.addAttribute("specialities", specialityService.getAll());

        return "specialities";
    }

}
