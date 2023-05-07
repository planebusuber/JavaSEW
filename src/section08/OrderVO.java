package section08;
// 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 
//				  외부로부터 내부를 감싸 숨겨 은닉한다.
// private(접근제한자) - 클래스 안에서만 사용이 가능 
//get 은 불러오는것, set 은 값 입력
//Database 값 운반용으로 사용
//네트워크 통신 값 오브젝트

public class OrderVO {
	
	
	private int orderNo;
	private int productNo;
	private String productName;
	private int memberId;
	private String memberName;
	private String address;

	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
