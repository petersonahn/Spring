package kr.ac.inhatc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class jspService {
	int count;
	public String hello() {
		return "hello";
	}
	public int getCount() {
		return count++;
	}
	
}
