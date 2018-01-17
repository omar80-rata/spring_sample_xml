import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService service = new CustomerServiceImp();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class); 
		System.out.println(service.findAll().get(0).getFirstName());
	}

}