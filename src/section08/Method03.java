package section08;

public class Method03 {
		public static void main(String[] args) {
				MemberVO member = new MemberVO();
				
			//System.out.println("id : "+ member.getId());
			
			member.setId("plane.bus.uber");
			member.setName("정범준");
			System.out.println("I D : " + member.getId());
			System.out.println("N A M E : " + member.getName());
			
			
		}
}