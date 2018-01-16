package com.journaldev.spring.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.journaldev.spring.service.MyAwareServiceLC;
import com.journaldev.spring.service.MyEmployeeService;

/**
 * 
 * @author matteodaniele
 * @update 1/11/2018
 * @version 0.5.1
 */
public class SpringFourTypesLifeCycleMain {
	

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-lc-types.xml") ;
		System.out.println("Spring Context initialized");
		
		MyEmployeeService service = context.getBean("myEmployeeService", MyEmployeeService.class);
		//EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("Employee Name="+service.getEmployee().getName());
		
		context.getBean("myAwareServiceLC", MyAwareServiceLC.class);
			
		context.close();
		System.out.println("Spring Context Closed");
	}

}
