package section09;



public class Constructor02 {
	public static void main(String[] args) {
		Game game1 = new Game();
		game1.info();
		
		System.out.println("===================================");
		
		Game game2 = new Game("FIFA ONLINE 4","스포츠", "부분 유료화", "PC");
		game2.info();
		
		System.out.println("==================================");
		
		Game game3 = new Game("리그오브레전드", "AOS", "부분 유료화", "PC");
		game3.info();
		
		System.out.println("==================================");
		
		Game game4 = new Game("OSU!", "리듬 게임","무료", "PC");
		game4.info();
		
	}
}
