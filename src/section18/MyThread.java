package section18;

public class MyThread {


	public void run() {
		System.out.println("MyThread 시작!");
		
		try {
			Thread.sleep(2000); //2초동안 일시정지
		}	catch(Exception e) {
		
		
		System.out.println("MyThread 종료!");
	}
}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	}
