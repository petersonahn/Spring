package kr.ac.inhatc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class jspController {
	@RequestMapping("/")
	public String index() {
		return "hello";
	}
	@RequestMapping("board")
	public String board(Model model, String id) {
		model.addAttribute("id", id);
		return "board";
	}
	@RequestMapping("board2")
	public ModelAndView board2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "ModelAndView");
		mv.setViewName("board");
		return mv;
		
	}
	@RequestMapping("board3")
	public ModelAndView board3() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "ModelAndView");
		mv.setViewName("board");
		return mv;
		
	}

}
