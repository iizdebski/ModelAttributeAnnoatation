package com.izdebski.controller;

import com.izdebski.model.User;
import com.izdebski.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @RequestMapping(value="/registerSuccess", method=RequestMethod.POST)
    public String registerSuccess(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "redirect:/listUsers";
    }

    @RequestMapping(value="/listUsers", method=RequestMethod.GET)
    public ModelAndView registerSuccess(ModelAndView modelAndView){
        modelAndView.setViewName("UserList");
        List<User>userList=userService.getUserList();
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
}