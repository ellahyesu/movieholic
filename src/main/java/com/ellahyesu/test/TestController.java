package com.ellahyesu.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ellahyesu.test.bo.TestBO;

@Controller
public class TestController {
	
	@Autowired
	private TestBO testBO;

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "###Hello World!!!!";
	}

	@ResponseBody
    @RequestMapping("/test_db")
    public Map<String, Object> testDb() {
		Map<String, Object> result = testBO.getUser(); 
        return result; 
    }

	@RequestMapping("/test_jsp")
    public String testJsp() {
        return "test/test"; 
    }
}
