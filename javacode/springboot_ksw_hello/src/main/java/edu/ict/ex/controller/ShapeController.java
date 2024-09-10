package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.CircleVO;
import edu.ict.ex.vo.RectangleVO;
import edu.ict.ex.vo.TriangleVO;

@Controller
@RequestMapping("/shape")
public class ShapeController {

	@GetMapping("/area")
	public String areaView() {
		return "shape/area";
	}
	
	@PostMapping("/rectangle")
	public String rectangle(RectangleVO rectangleVO) {
		return "shape/rectangle";
	}
	
	@PostMapping("/triangle")
	public String triangle(TriangleVO triangleVO) {
		return "shape/triangle";
	}
	
	@PostMapping("/circle")
	public String circle(CircleVO circleVO) {
		return "shape/circle";
	}
	
}