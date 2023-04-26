package section01;
/* 여러줄 주석
 *
 * 
 */
	public class Hello {
	public static void main(String[] args) {
		//
		System.out.println("Hello, JAVA!!!");
	
		printNum(424);
	}
	
	/**JavaDoc 주석
	 * auth : 정범준
	 * 생성일 : 2023.04.24
	 * 
	 * printNum - 입력받은 정수 출력
	 * @param num
	 */
	
	public static void printNum(int num) {
		System.out.println("num:" +num);
	}
	
}