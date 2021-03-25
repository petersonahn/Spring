package kr.ac.inhatc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {
	@RequestMapping("inhatc")
	public String inhatc(){
		return "www.inhatc.ac.kr/sites/kr/index.do";
	}
	@RequestMapping("name")
	public String name(String id){
		return "당신의 학번은 : " + id;
	}
	@RequestMapping("hello")
	public String gugudan(int num) {
		String result="";
		for(int i=1; i<=9; i++) {
			result = result + num+"*"+i+"="+(num*i)+ " ";
		}
		return result;
	}
	@Autowired
	BoardService boardService;
	@RequestMapping("mvc")
	public String mvc() {
		return boardService.jsp();
	}
	
}
