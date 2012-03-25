package edu.unlv.kilo.web;

import java.util.Date;

import edu.unlv.kilo.domain.ChartingEntity;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/chartingentitys")
@Controller
@RooWebScaffold(path = "chartingentitys", formBackingObject = ChartingEntity.class)
public class ChartingForm 
{
	private Date start;
	
	private Date end;
	
	private long day_Interval;
	
	public void setStart(Date start)
	{
		this.start = start;
	}
	
	public void setEnd(Date end)
	{
		this.end = end;
	}
	
	public void setInterval(long interval)
	{
		day_Interval = interval;
	}
}

