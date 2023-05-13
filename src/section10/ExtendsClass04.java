package section10;

import section10.access1.Car;
import section10.access1.Car2;
/*	
 * 
 * 싱글톤(Singleton) 디자인 패턴
 *  Application에서 단 하나의 인스턴스(객체)만
 *  존재하도록 보장하는 패턴
 *  
 * 팩토리 (Factory) 디자인 패턴
 * 캡슐화 하여
 * 	
 * 
 * 
 * 
 */
public class ExtendsClass04 {
	public static void main(String[] args) {
		Car car10 = Car.getInstance();
		Car car11 = Car.getInstance();
		Car car12 = Car.getInstance();
		
		System.out.println("car10 : " + System.identityHashCode(car10));
		System.out.println("car11 : " + System.identityHashCode(car11));
		System.out.println("car12 : " + System.identityHashCode(car12));
		
		Car2 car20 = Car2.createCar();
		Car2 car21 = Car2.createCar();
		Car2 car22 = Car2.createCar();

		System.out.println("car20 : " + System.identityHashCode(car20));
		System.out.println("car21 : " + System.identityHashCode(car21));
		System.out.println("car22 : " + System.identityHashCode(car22));
		
	}
	
}
