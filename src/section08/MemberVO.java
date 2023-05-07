package section08;
/*
 * Vo(Value Object), DTO(Data Transfer Object)
 *   값 프로젝트로써 목적의 맞는 변수의 집합.
 *   주로 Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * 
 * private는 다른 곳으로 못 가져가도록 보안성을 높인 명령어
 * 
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고
 * 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * 우클릭 - 소스 - getter setter 
 * 
 */
public class MemberVO {
	
		private String id;
		private String passward;
		private String name;
		private String phonNumber;
		private String email;
		private String address;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id; 
		}
		public String getPassward() {
			return passward;
		}
		public void setPassward(String passward) {
			this.passward = passward;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhonNumber() {
			return phonNumber;
		}
		public void setPhonNumber(String phonNumber) {
			this.phonNumber = phonNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}