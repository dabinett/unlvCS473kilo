package edu.unlv.kilo.web;

import edu.unlv.kilo.domain.ChartingEntity;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chartingentitys")
@Controller
@RooWebScaffold(path = "chartingentitys", formBackingObject = ChartingEntity.class)
public class ChartingForm 
{
	
}
