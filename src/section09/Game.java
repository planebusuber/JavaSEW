package section09;

public class Game {
	public String title;
	public String genre;
	public String price;
	public String console;
	
	static {
		System.out.println("static 초기화 블럭");
	}
	{
		System.out.println("초기화블럭");}
	
	
	public Game() {
		System.out.println("Game 생성자 1");
		this.title = "메이플 스토리 ";
		this.genre = "RPG ";
		this.price = "부분 유료화";
		this.console = "PC";
	
	}
	//오버로딩
	public Game(
			String title,
			String genre,
			String price,
			String console
			) {
		System.out.println("Game 생성자 2");
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.console = console;
	}
		
	
	public void info() {
		System.out.println("게임명 : " + title);
		System.out.println("장르 : " + genre);
		System.out.println("가격 : " + price);
		System.out.println("게임기종 : " + console);
		
		
		
		
		
		
		
	
	}
	
	
}
