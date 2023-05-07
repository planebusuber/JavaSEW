package section07;

/*
 
OOP (Object Oriented Programming) 
- 객체 지향 프로그래밍
- 프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드(함수)를
   하나의 논리적 단위인 객체로 묶는 방식
   
   객체(Object)
   - 물리적으로 존재하거나 추상적으로 생각할 수 있는것 중에서
      정의 가능하고 식별 가능한 것을 말한다.
      
      EX) 물리적인 객체 -사람, 모니터, 상품 , 회원
   			 추상적인 객체 - 주문, 회계장부, 생산 등 .. 

 	객체의 구성요소
 	1)  속성 
 	2) 기능
 	
 	EX)  티모 ^모^ 객체
			속성 1) 공격력 - 10
			속성 2) 방어력 -3
		    속성 3) 체력(HP) - 800
		    속성 4) 이동속도 - 5
			
			기능 1) 실명 - 상대 시야 가리고 독 스킬 x
		    기능 2) 신속 - 이동속도 올림
			
 	 Class 
  -객체를 만들기 위한 설계도
  - Class에 작성된 코드를 읽어 인스턴스(객체)화 한다 => 메모리에 저장한다 or 올린다
  
  클래스의 구조
  	(접근제한자) class 클래스명 (extends 상속) (implements 인터페이스 상속) { // 클래스 선언부
 				(생성자) =>초기화 목적
 				변수 (멤버 변수, 멤버 필드) => 속성
 				메소드 (멤버 메소드) => 기능
 }
  객체화 - new 연산자로 인스턴스화 가능!
  클래스명(타입) 변수명 = new 클래스 ();
  
  가비지 컬렉터 (Garbage Colla)
  		자바에서 동적
  
 
 

 */
public class OOP01 {
	public static void main(String[] args) {
			Car c =new Car(); // 클래스를 이용해서 객체를 생성한 것
			Car c2 = new Car();
			Car c3 = new Car();
			// Type : Car 
			// Name : c
			
			//속성명 : 속성값
			//wheel : 4
			System.out.println("wheel의 개수는" + c.wheel + "개 입니다.");
			System.out.println("c2 wheel의 개수는" + c2.wheel + "개 입니다.");
			System.out.println("c3 wheel의 개수는" + c3.wheel + "개 입니다.");
			
			c.wheel = 12;
			c2.wheel = 12;
			c3.wheel = 2;
			System.out.println("wheel의 개수는" + c.wheel + "개 입니다.");
			System.out.println("c2 wheel의 개수는" + c2.wheel + "개 입니다.");
			System.out.println("c3 wheel의 개수는" + c3.wheel + "개 입니다.");
			//wheel : 12
	}

}