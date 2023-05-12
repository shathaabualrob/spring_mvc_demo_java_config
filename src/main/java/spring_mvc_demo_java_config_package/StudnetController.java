package spring_mvc_demo_java_config_package;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudnetController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String ProcessForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("theSTudent: " + theStudent.getFirstName()
				+" "+ theStudent.getLastName());
		
		return "student-confirmation";
	}
	
}
