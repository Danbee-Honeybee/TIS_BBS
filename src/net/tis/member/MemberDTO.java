package net.tis.member;

public class MemberDTO { //ȸ���� ���� Ŭ����
	String userId; //���� ���̵�
	String userPW; //���� ��й�ȣ
	String userName; //���� �̸�
	String userPhone; //���� ��ȭ��ȣ
	String userAddress; //���� �ּ�
	
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
