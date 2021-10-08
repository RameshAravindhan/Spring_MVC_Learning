package com.SpringMVC.DemoProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }

    @RequestMapping("/HomePageForm")
    public String showPageForm() {
        return "main-menu-Form";
    }

    @RequestMapping("/ProcessPage")
    public String processPage() {
        return "process-page";
    }

    @RequestMapping("/ServiceProcess")
    public String serviceProcessPage(Model model, HttpServletRequest request, @RequestParam String colourField) {

        String c = request.getParameter("colourField");

        String c1 = c.toUpperCase();
        String c2 = c1 + colourField;

        model.addAttribute("cName", c2);

        return "HomePage";
    }

}
