package edu.unlv.kilo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/charting/**")
@Controller
public class ChartingController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@Valid ChartingForm form, @PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
    	
    }

    @RequestMapping
    public String index() 
    {
        return "charting/index";
    }
}
