package component;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Kid {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext("component/applicationContext.xml");
		
		Robot robot = (Robot) context.getBean("rooobot");
		robot.fight();
	}

}
