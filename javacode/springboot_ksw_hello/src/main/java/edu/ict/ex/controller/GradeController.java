package edu.ict.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.GradeVO;


@Controller
@RequestMapping("/grade")
public class GradeController {

	@GetMapping("/total")
	public String total(Model model) {
		int kor = 90;
		int eng = 80;
		int math = 70;
		
		GradeVO grade = new GradeVO(kor, eng, math);
		
		model.addAttribute("grade", grade);
		
//		model.addAttribute("kor", grade.getKor());
//		model.addAttribute("eng", grade.getEng());
//		model.addAttribute("math", grade.getMath());
//		model.addAttribute("total", grade.getTotal());
//		model.addAttribute("avg", grade.getAvg());
		
		return "grade/total";
	}
	
	@GetMapping("/total2")
	public String total2(HttpServletRequest req, Model model) {
		
		int kor = Integer.valueOf(req.getParameter("kor"));
		int eng = Integer.valueOf(req.getParameter("eng"));
		int math = Integer.valueOf(req.getParameter("math"));
		
		GradeVO grade = new GradeVO(kor, eng, math);
		model.addAttribute("grade", grade);
		
		return "grade/total2";
	}
	
	@GetMapping("/form")
	public String areaView() {
		return "grade/form";
	}
	
	@PostMapping("/grade")
	public String rectangle(GradeVO gradeVO) {
		return "grade/grade";
	}
	
}