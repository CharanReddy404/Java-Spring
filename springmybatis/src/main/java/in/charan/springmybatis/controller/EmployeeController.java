package in.charan.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.charan.springmybatis.dao.EmployeeMapper;
import in.charan.springmybatis.entity.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeMapper mapper;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("list-employees");
		mav.addObject("listemployees", mapper.getAllEmployees());
		return mav;
	}
	
	@RequestMapping("/showFormForAddEmployee")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("add-employee");
		mav.addObject("employee", new Employee());
		return mav;
	}
	
	@RequestMapping("/saveProcess")
	public String saveProcess(@ModelAttribute("employee") Employee employee) {
		System.out.println("Employee: "+employee);
		if(employee.getId() == null) {
			mapper.saveEmployee(employee);
		}else {
			mapper.updateEmployee(employee);
		}
		return "redirect:/";
	}
	
	@RequestMapping("/deleteemployee")
	public String deleteEmployee(@RequestParam("employeeId") int employeeId) {
		System.out.println("EmployeeId: "+employeeId);
		mapper.deleteEmployee(employeeId);
		return "redirect:/";
	}
	
	@RequestMapping("/editemployee")
	public ModelAndView editEmployee(@RequestParam("employeeId") int employeeId) {
		ModelAndView mav = new ModelAndView("add-employee");
		System.out.println("\nEmployeeId: "+employeeId);
		Employee employee = mapper.findById(employeeId);
		System.out.println("\nEmployee: "+employee);
		mav.addObject("employee",employee);
		return mav;
	}
	
}
