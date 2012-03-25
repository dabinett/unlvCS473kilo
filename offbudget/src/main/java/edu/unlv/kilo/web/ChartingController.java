package edu.unlv.kilo.web;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/charting/**")
@Controller
public class ChartingController 
{

    @RequestMapping(method = RequestMethod.POST)
    public void post(@Valid ChartingForm form, BindingResult result, Model model, HttpServletRequest request) 
    {
    	Calendar startDate = form.getStartDate();
    	Calendar endDate = form.getEndDate();
    	int interval = form.getDay_Interval();
    	// CALL DANE
    	
    	
    }

    @ModelAttribute("chartingForm")
    public ChartingForm fromBackingObject() 
    {
    	return new ChartingForm();
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String createForm(Model model) 
    {
    	ChartingForm form = new ChartingForm();
    	model.addAttribute("chartData", form);
        return "charting/index";
    }
}
