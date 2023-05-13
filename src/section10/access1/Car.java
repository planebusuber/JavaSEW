package section10.access1;

public class Car {
	
	private static Car car = new Car();
	
	
	private Car () {
		System.out.println("Car() 생성자 입니다.");
	}
	
	public static Car getInstance() {
		return car;
		
	}
	
	
}
