package section13;

import section13.access2.MusicImplements;

public class InnerClass05 {
	public static void main(String[] args) {
	//String brand = new MusicImplements().getBarnd();
	
		MusicImplements mu1 = new MusicImplements();
		String brand = mu1.barnd;
		
		
		
	System.out.println("Brand : " + brand);
}
}
