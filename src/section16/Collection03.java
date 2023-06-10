package section16;

import java.util.Vector;

/*
 * 
 * vector
 * 선형배열 객체
 * ArrayList와 동일
 * Thread safe - sychonized 되어있다.
 * 
 */
public class Collection03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
	
		//추가
		vec.add("피카츄");
		vec.add("라이츄");
		vec.add("파이리");
		
		System.out.println("저장된 데이터 개수 : " + vec.size());
	
		//데이터 가져오기
		System.out.println("1번 인덱스 데이터 가져오기 : " + vec.get(1));
	}
	
}
