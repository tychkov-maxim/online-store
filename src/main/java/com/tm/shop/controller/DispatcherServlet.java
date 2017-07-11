package com.tm.shop.controller;

import com.tm.shop.dao.UserDao;
import com.tm.shop.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DispatcherServlet {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelMap model) {
        model.addAttribute("Title", "It's title yobana");
        model.addAttribute("END", "Spring 3 MVC Hello World");
        return new ModelAndView("index",model);

    }


    @RequestMapping(value = "/db", method = RequestMethod.GET)
    public ModelAndView db(ModelMap model) {
        model.addAttribute("Title", "It's title yobana");
        model.addAttribute("END",  "");
        return new ModelAndView("index",model);

    }

}
