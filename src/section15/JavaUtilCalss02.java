package section15;

import java.util.Random;

public class JavaUtilCalss02 {
	public static void main(String[] args) {
		int [] lNum = new int[45];
		
		for(int i = 0; i< lNum.length; i++) {
			lNum[i] = i +1;
			
		}
		
		Random ran = new Random();
		for (int i = 0; i<lNum.length;i++) {//셔플
			//0~44까지 숫자중 임의값 반환
			int changeIndex = ran.nextInt(45);
			int tmp = lNum[i];
			lNum[i]=lNum[changeIndex];
			lNum[changeIndex] =tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(lNum[i]+" / ");
		}
}
}