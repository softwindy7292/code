package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.UserVO;


@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/form")
	public String formView() {
		return "login/form";
	}
	
	@GetMapping("/check")
	public String check(Model model, UserVO user) {
		//String id = (String) req.getParameter("id");
		//String pw = (String) req.getParameter("pw");
		
		//user.setId(id);
		//user.setPw(pw);
		
		//UserVO user = new UserVO(id, pw);
		
		model.addAttribute("user", user);
		
		return "login/check";
	}
	
}