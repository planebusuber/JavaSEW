package section07;
/*
 변수(variable)
 	메모리 공간에 붙여진 이름
 	
 	변수 선언 및 초기화
 	자료형(type) 변수명 = 값;
 	
 	1. 타입에 따른 변수
 	   기본형 - 예약어, 소문자로 시작, 직접 값을 가지고 있다.
 	   		8가지 - boolean, byte, short, int, long, float, double, char 
 	   참조형 - 기본형 외 나머지 전부! 참조(주소)값을 가지고 있다. 보통 대문자로 시작
			ex) String
			
	2. 선언 위치에 따른 변수
		전역변수 - 클래스 안에 선언된 변수(멤버필드, 멤버변수)
				 초기화 하지 않으면 default 값이 들어간다.
				 boolean -false
				 정수형 - 0
				 실수형 - 0.0
				 참조형 - null
		지역변수 - 메소드 또는 생성자 안에 선언된 변수
				 추가로 매개변수도 지역변수이다.
				 반드시 초기화를 해야한다!!!! (컴파일 에러)
				 메소드 종료시 같이 소멸된다.

 */
public class Var {
	
	// 전역변수 
	int gNum1 = 20;
	int gNum2;
	
	
	public static void main(String[] args) {
		int num; // 변수 선언
		num = 10; // 변수 초기화
		
		int num2;	//지역변수는 초기화 필수
		
		//System.out.println(num);
		//System.out.println(num2);	//초기화 안하면 컴파일 에러 발생 !
		
		Car car1 =new Car();
		System.out.println(car1.wheel);
		System.out.println(car1.color);
		//System.out.println(car1.camera);
		
		setCaroption(car1);
		System.out.println(car1.wheel);
		System.out.println(car1.color);
		
	}
	
	private static void setCaroption(Car car1) {
		// TODO Auto-generated method stub
		
	}

	public static void setColor(Car car) {
		car.wheel = 3;
		car.color = "블랙";
				
				
	}

}
