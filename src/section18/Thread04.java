package section18;
/*
 * synchronized 예약어 
 * 병렬 Thread 에서 시켜주는 예약어
 * 
 * 
 * 
 */
import section18.access2.Brother;
import section18.access2.Sister;
import section18.access2.Wallet;

public class Thread04 {
	public static void main(String[] args) {
	System.out.println("메인 스레드가 시작됩니다.");
	//Wallet 객체 생성하기
	Wallet wallet = new Wallet();
	
	//Sister Thread 생성
	Sister sister = new Sister(wallet);
	
	//Brother Thread 생성
	Brother brother = new Brother(wallet);
	
	sister.start();
	brother.start();
	
	System.out.println("메인 스레드가 종료됩니다.");
}
}
