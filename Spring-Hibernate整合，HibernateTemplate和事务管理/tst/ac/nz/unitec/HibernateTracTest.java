package ac.nz.unitec;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateTracTest {
	@Test
	public void addTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
		Service service = (Service)act.getBean("service");
		User user = new User();
		user.setDt(new Timestamp(new Date().getTime()));
		user.setName("zhangsan");
		service.add(user);
	}
}
