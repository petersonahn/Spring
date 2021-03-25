package kr.ac.inhatc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class BoardController {
	@Autowired
	BoardService boardService;
	@RequestMapping("board")
	public String board(Model model, @RequestParam("test") String id) {
		return boardService.jsp();
		
	}
}
