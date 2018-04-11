package snipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import snipin.entity.Department;
import snipin.entity.TestResponse;
import snipin.service.DataService;
import snipin.util.LoggerTest;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("loggerTest")
    private LoggerTest loggerTest;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model, HttpServletRequest req) {
        model.addAttribute("title", "Home page");
        model.addAttribute("ip", "ip " + loggerTest.getIp());

        return "index";
    }

    @RequestMapping(value = "/testreq", method = RequestMethod.GET)
    @ResponseBody
    public Object getJson(Model model, HttpServletRequest req) throws ParseException {

        List<String> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));
        list.add(sdf.format(new Timestamp(System.currentTimeMillis())));

        return list;
    }

    @RequestMapping(value = "/testreqview", method = RequestMethod.GET)
    public String getJsonView(Model model, HttpServletRequest req) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return "test_page";
    }

}
