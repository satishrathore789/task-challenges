package com.beyondtalent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.service.FindContaintService;

@Controller
public class SearchController {
	
	@Autowired
	private FindContaintService findContaintService;
	

	@RequestMapping(value="search", method=RequestMethod.GET)
	public String prohome(Model map,HttpServletRequest request,RedirectAttributes attributes,HttpSession httpSession)
	{   
		PersonalInfo personal = new PersonalInfo();
		map.addAttribute("register", personal);

		return"search";

}
	
	@RequestMapping(value="/searchdata", method=RequestMethod.POST)
	public String edithome(@ModelAttribute("register") PersonalInfo register,HttpServletRequest request,
			RedirectAttributes attributes, Model map)
	{   
			//System.out.println(register.getSearchTxt());	
			
		
        			
			  //  List list = findservice.findByContaint(register.getSearchTxt());
			// List<PersonalInfo> list = findContaintService.findByFirstName(register.getSearchTxt());
       //      List<Skills> skill = findservice.findBySkillsContaining(register.getSearchTxt());
			 
			 //List<PersonalInfo> list1 = findContaintService.findByLastname(register.getSearchTxt());
			 
			 
			List<Object[]> skill = findContaintService.FindBySkill(register.getSearchTxt());
			 
		 if(!skill.isEmpty())
		 {
			 map.addAttribute("List", skill);
			return"search";
			 
		 } 
			 
			 
			/*for(Object[] tuple : skill) {
			   String name=((String) tuple[0]);
			    String skills=((String) tuple[1]);
			}*/
			  
			
			
			
/*			System.out.println(skill);
		  System.out.println(skill.toString());
         System.out.println(skill.getClass());			 
*/			    
			 /* Iterator it=skill.iterator();
			       while(it.hasNext())
			       {
			    	   System.out.println(it.next());
			    	  PersonalInfo info = (PersonalInfo)it.next();
			    	   System.out.println(info.getFirstName());
			    	   
			       }
			 */     
			       
			       
			       return"search";     
			       
			       
	/*		 
			if (!list.isEmpty())
			{
			
				map.addAttribute("List", list);
				return"search";		
			}
			else if(!list1.isEmpty())
			{
					map.addAttribute("List", list1);
					return"search";		
				}
				else
				{
					return "search";
				}

			}
*/		
			 
			
}
}
	
	
	
	
	

