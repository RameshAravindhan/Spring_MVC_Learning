package com.SpringMVC.DemoProject;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller

public class HomeController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


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

    @RequestMapping("/TagsPage")
    public String tagsPageMethod(Model model) {
        model.addAttribute("student", new Student());

        return "TagsMenuPage";
    }

    @RequestMapping("/processStudentForm")
    public String DisplayPage(@Valid @ModelAttribute("student") Student stu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "TagsMenuPage";
        } else
            return "Student-form-page";
    }


}
