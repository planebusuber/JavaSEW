package section05;
/*
 * 중첩 for문
 * 	for문 안에 for문
 * 
 * 
 * 
 */
public class Loop05 {
	public static void main(String[] args) {
		/*
		 * i=0
		 * j=0, 1,2,3,4,5,6,7
		 * *******(for문 끝남)
		 * i=1
		 * j=0, 1,2,3,4,5,6,7
		 * *******(for문 끝남)
		 * 6까지 실행 반복
		 * 
		 */
		//System.out.println("j: 0|1|2|3|4|5|6");
		for(int i = 0; i < 7; i++) {
			//System.out.print("i)"+i+":");
			
			/*
			 * i : 0~7
			 * 
			 * i=0 일때
			 * j는 0+1 =1
			 * j=0
			 *	 *
			 * j=1
			 * i=1 일때
			 * 	j=0,1
			 * 	  * *
			 * i=2 일때
			 * j= 0,1,2
			 *    *	* *
			 * 
			 * 
			 * 
			 */
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println(); //개행(줄바꿈)
		}
	}
}