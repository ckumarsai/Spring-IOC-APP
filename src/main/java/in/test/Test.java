package in.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.saikumar.beans.Car;
import in.saikumar.beans.Deiselengine;
import in.saikumar.beans.Petrolengine;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Car car=context.getBean(Car.class);
		car.drive();
		Car cars=context.getBean(Car.class);
		cars.drive();
		Petrolengine de=context.getBean(Petrolengine.class);
		de.start();
		Petrolengine de1=context.getBean(Petrolengine.class);

		de1.start();
		System.out.println(de.hashCode());
		System.out.println(de1.hashCode());
		System.out.println(car.hashCode());
		System.out.println(cars.hashCode());

	}
}
