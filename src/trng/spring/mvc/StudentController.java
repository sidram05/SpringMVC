package trng.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	//add an initbinder........ to convert trim input strings
	//remove leading and trailing whitespace
	//resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor =
				new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a student object
		Customer theStudent = new Customer();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/showProductForm")
	public String showProductForm(Model theModel) {
		//create a student object
		Customer theStudent = new Customer();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "product-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("student") Customer theStudent,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}else {
			//log the input data
			System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
			return "student-confirmation";
		}
	}
	
	@RequestMapping("/processProductForm")
	public String processProductForm(
			@Valid @ModelAttribute("student") Product theStudent,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "product-form";
		}else {
			//log the input data
			return "product-confirmation";
		}
	}
}
