package kr.ac.inhatc.controller;
import org.springframework.*;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	private int a=0;
	public String jsp() {
		a++;
		return ""+a;
	}
}
