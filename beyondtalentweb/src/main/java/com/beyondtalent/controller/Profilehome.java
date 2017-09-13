package com.beyondtalent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.service.TimelineService;
import com.beyondtalent.model.PersonalInfo;


@Controller
public class Profilehome {
	
	
	@Autowired
 private	TimelineService timelineService; 
	
	
	
	@RequestMapping(value="/timeline", method=RequestMethod.GET)
	public String prohome(Model map,HttpServletRequest request,RedirectAttributes attributes,HttpSession httpSession)
	{
		 
		
	    PersonalInfo  findinfo=timelineService.findbyTimelineChar(request);
	    map.addAttribute("timeline1",findinfo);
		PersonalInfo timeLine = new PersonalInfo();
		 map.addAttribute("timeline", timeLine);
		return"timeline";
	
		
	}
	
	
	@RequestMapping(value="/timelineEdit", method=RequestMethod.POST)
	public String edittimeLine(@ModelAttribute("timeline") PersonalInfo timeLine1 ,HttpServletRequest request,RedirectAttributes attributes ,ModelMap map)
	{   
		
			//System.out.println(timeLine1.getListTimeline().get(0));
	        timelineService.saveTimeLine(timeLine1, request);       
		
	        
	        PersonalInfo  findinfo=timelineService.findbyTimelineChar(request);
	        
	         System.out.println(findinfo);
	        
	        
	        
	        
	        
	         /* for (PersonalInfo[] result : findinfo) {
	        	     System.out.println( result[0]);
	        	}
	        */  
	          
	          
			
			   map.addAttribute("timeline1",findinfo);
				
		
		return"timeline";

}

}
