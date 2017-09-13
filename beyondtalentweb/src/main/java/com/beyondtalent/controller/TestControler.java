package com.beyondtalent.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControler {



		
		@RequestMapping("/edit-profile-basic")
		String test() {
			
			return  "edit-profile-basic";
		}
		
		@RequestMapping("/edit-profile-password")
		String test2() {
			
			return  "edit-profile-password";
		}
		
		
		@RequestMapping("/edit-profile-interests")
		String test3() {
			
			return  "edit-profile-interests";
		}
		
		@RequestMapping("/edit-profile-work-edu")
		String test4() {
			
			return  "edit-profile-work-edu";
		}
		
		@RequestMapping("/edit-profile-settings")
		String test5() {
			
			return  "edit-profile-settings";
		}
		
		@RequestMapping("/newsfeed")
		String test6() {
			
			return  "newsfeed";
		}
		@RequestMapping("/myfriends")
		String test7() {
			
			return  "myfriends";
		}
		@RequestMapping("/newsfeed-images")
		String test8() {
			
			return  "newsfeed-images";
		}
		@RequestMapping("/nearbypeople")
		String test9() {
			
			return  "nearbypeople";
		}

}
