package com.rain.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rain.domain.Notice;
import com.rain.domain.Toudi;
import com.rain.domain.User;
import com.rain.service.RainService;
import com.rain.util.common.Constants;

@Controller
public class ToudiController {
	@Autowired
	@Qualifier("RainService")
	private RainService rainservice;
	
		@RequestMapping(value="/notice/see",method=RequestMethod.GET)
		 public String index(Model model,@RequestParam("id")Integer id){
			List<Toudi> notice_list = rainservice.getToudiList(id);
			//model.addAttribute("list",notice_list);
			List<User> job3=new ArrayList<User>();
			for(Toudi job:notice_list)
			{
			User job1 = rainservice.get_UserInfo(job.getUserid());
			job3.add(job1);
			}
			model.addAttribute("list",job3);
			return "notice/see";
			}

		@RequestMapping(value="/notice/send",method=RequestMethod.GET)
		 public String add(Model model,HttpSession session){
			User user = (User) session.getAttribute(Constants.USER_SESSION);
			model.addAttribute("job1",user);
			List<Notice> notice_list = rainservice.get_NoticeList();
			model.addAttribute("notice_list",notice_list);
			return "/notice/send";
		}
		@RequestMapping(value="/notice/send",method=RequestMethod.POST)
		 public ModelAndView add(ModelAndView mv,@ModelAttribute Toudi toudi){
			rainservice.insert_Toudi(toudi);
			mv.setViewName("redirect:/notice/send");
			return mv;
		}
	}
