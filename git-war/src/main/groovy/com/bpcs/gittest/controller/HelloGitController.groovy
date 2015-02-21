package com.bpcs.gittest.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView


/**
 * Simple controller to say hello git for test
 */
@Controller
@RequestMapping("/welcome")
class HelloGitController
{
    @RequestMapping(method = [RequestMethod.GET, RequestMethod.HEAD])
    public ModelAndView helloWorld(){

        ModelAndView model = new ModelAndView("HelloGitPage")
        model.addObject("msg", "hello git world")

        return model
    }

}
