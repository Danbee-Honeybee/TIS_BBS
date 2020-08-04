package net.tis.member;

public class MemberDTO { //회원들 접근 클래스
	String userId; //유저 아이디
	String userPW; //유저 비밀번호
	String userName; //유저 이름
	String userPhone; //유저 전화번호
	String userAddress; //유저 주소
	
	public String getUserId() { return userId;}
	public void setUserId(String userId) { this.userId = userId;}
	public String getUserPW() {return userPW;}
	public void setUserPW(String userPW) {this.userPW = userPW;}
	public String getUserName() {return userName;}
	public void setUserName(String userName) {this.userName = userName;}
	public String getUserPhone() {return userPhone;}
	public void setUserPhone(String userPhone) {this.userPhone = userPhone;}
	public String getUserAddress() {return userAddress;}
	public void setUserAddress(String userAddress) {this.userAddress = userAddress;}
}
