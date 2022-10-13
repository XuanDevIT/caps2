//package com.example.capstone.Controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.capstone.entity.TeacherEntity;
//import com.example.capstone.service.TeacherService;
//
//@Controller
//@RequestMapping("/teacher")
//public class TeacherController {
//	@Autowired
//	private TeacherService teacherService;
//	
//	@GetMapping()
//	public String view(Model model, TeacherEntity teacher) {
////		List<TeacherEntity> teacherList = teacherService.findAll();
////		model.addAttribute("teacherList", teacherList);
//		return "administrator/teacherManage";
//	}
////	@PostMapping("/teacher/add")
////	public String addTeacher(Model model) {
////		Teacher Teacher = new Teacher();
////		model.addAttribute("teacher", Teacher);
////		return "redirect:/teacher";
////	}
//
//	@PostMapping("/teacher/add1")
//	public String save(@Valid @ModelAttribute("teacher") TeacherEntity Teacher, BindingResult result) {
//		//teacherService.save(Teacher);
//		return "redirect:/teacher";
//	}
//	
//	@GetMapping("/delete")
//	public String delete(@PathVariable Long id) {
//		//teacherService.delete(id);
//		return "redirect:/teacher";
//	}
//	
//	@GetMapping("/update")
//	public String updateTeacher(@PathVariable("id") Long id, Model model) {
//		//model.addAttribute("teacher", teacherService.findById(id));
//		return "addTeacher";
//	}
//}
