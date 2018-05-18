package trng.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import trng.spring.model.Customer;
import trng.spring.model.PlaceOrder;
import trng.spring.model.Product;

@Controller
@RequestMapping("/customer")
public class CustomerController {
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
		Customer theCustomer = new Customer();
		
		//add student object to the model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/showProductForm")
	public String showProductForm(Model theModel) {
		//create a student object
		Product theProduct= new Product();
		//add student object to the model
		theModel.addAttribute("product", theProduct);
		
		return "product-form";
	}
	
	@RequestMapping("/showOrderForm")
	public String showOrderForm(Model theModel) {
		//create a student object
		PlaceOrder theOrder= new PlaceOrder();
		//add student object to the model
		theModel.addAttribute("order", theOrder);
		
		return "order-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}else {
			//log the input data
			System.out.println("Customer: " + theCustomer.getFirstName()
							+ " " + theCustomer.getLastName());
			return "customer-confirmation";
		}
	}
	
	@RequestMapping("/processProductForm")
	public String processProductForm(
			@Valid @ModelAttribute("product") Product theProduct,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "product-form";
		}else {
			//log the input data
			return "product-confirmation";
		}
	}
	
	@RequestMapping("/processOrderForm")
	public String processOrderForm(
			@Valid @ModelAttribute("order") PlaceOrder theOrder,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "order-form";
		}else {
			//log the input data
			return "order-confirmation";
		}
	}
}
