package com.beyondtalent.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.TimeLineRepo;
import com.beyondtalent.impl.TimelineDetailRepo;
import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.model.TimeLineDetail;

@Service
public class TimelineService {
	
	@Autowired
	private TimeLineRepo lineRepo;

	@Autowired
	 private TimelineDetailRepo detailRepo;
	
	 static Long timelineid=(long) 1;
	 
	public void saveTimeLine(PersonalInfo timeLine1,HttpServletRequest request) {
		
		   TimeLineDetail timeLineDetail=new TimeLineDetail();
		      
		 
		   
		HttpSession httpSession=request.getSession();
		        List    list=    (List) httpSession.getAttribute("state");
            Iterator it=list.iterator();
            if(it.hasNext())
            {
         PersonalInfo oldPersonalinfo       =  (PersonalInfo) it.next();
                    
          /*  System.out.println(oldPersonalinfo.getPersonalId());
            
           timeLine1.setPersonalId(oldPersonalinfo.getPersonalId());
		   timeLine1.setFirstName(oldPersonalinfo.getFirstName());
		   timeLine1.setLastName(oldPersonalinfo.getLastName());
		   timeLine1.setEmail(oldPersonalinfo.getEmail());
		   timeLine1.setPassword(oldPersonalinfo.getPassword());
		   timeLine1.setDob(oldPersonalinfo.getDob());
		   timeLine1.setGender(oldPersonalinfo.getGender());
		   timeLine1.setCity(oldPersonalinfo.getCity());
		   timeLine1.setCountry(oldPersonalinfo.getCountry());
		   
		  */
		   it=timeLine1.getListTimeline().iterator();
		  while(it.hasNext())
		  {
			  
			TimeLineDetail  timeLineDetail1    =(TimeLineDetail) it.next();
		  System.out.println("time line open");
		  System.out.println(timeLineDetail.getTimelineChar());
		  System.out.println(timeLineDetail.getPersonalTimelineId());
		  System.out.println(timeLineDetail.getTimelineId());
			System.out.println("time line end");  
      		
			 timeLineDetail.setPersonalTimelineId(oldPersonalinfo.getPersonalId());
		   timeLineDetail.setTimelineChar(timeLineDetail1.getTimelineChar());
			 // timeLineDetail.setTimelineId(timelineid);
			  detailRepo.save(timeLineDetail);    
			 
		  }
		  
		  //lineRepo.save(timeLine1);
		  
		  
		 }
            timelineid++;
	}

	public PersonalInfo findbyTimelineChar(HttpServletRequest request) {
		
		
		List list1 = null;	
		HttpSession httpSession=request.getSession();
        List    list=    (List) httpSession.getAttribute("state");
    Iterator it=list.iterator();
    if(it.hasNext())
    {
    PersonalInfo oldPersonalinfo       =  (PersonalInfo) it.next();
            
     	    return lineRepo.findOne(oldPersonalinfo.getPersonalId());
	}
    else
    {
      return null;	
    }
	}
}
