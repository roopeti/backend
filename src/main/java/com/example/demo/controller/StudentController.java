package com.example.demo.controller;

import com.example.demo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

	@GetMapping("/hello2")
	public String getStudents(Model model) {
		List<Student> students = Arrays.asList(new Student("Kate", "Cole"), new Student("Dan", "Brown"),
				new Student("Mike", "Mars"));
		model.addAttribute("students", students);
		return "hello2";
	}
}
