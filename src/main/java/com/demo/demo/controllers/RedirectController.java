/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ABC
 */
@RestController
public class RedirectController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getView() {
        return new ModelAndView("home");
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginView() {
        return new ModelAndView("login");
    }
    
    @RequestMapping(value = "/logout-success", method = RequestMethod.GET)
    public ModelAndView getLogoutView() {
        return new ModelAndView("logout");
    }
    
//    @RequestMapping("/login")
//    public ModelAndView login() throws Exception {
//        DemoUserDetail detail = DemoUser.getCurrentUser();
//        String urlToReDirect = VuukaUser.determineTargetUrl(detail);
//        return new ModelAndView(urlToReDirect);
//    }
    
}
