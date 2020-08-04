package net.tis.goods;

public class GoodsDTO {
	private int gnum; //상품번호
	private String gname; //상품이름
	private String gtitle; //상품 게시판 제목
	private String gcontent; //상품 게시판 내용
	private String gfile; //상품 이미지 파일
	private int gsize; //상품 이미지 파일 크기
	private String gwriter; //상품 게시판 작성자
	public int getGnum() {return gnum;}
	public void setGnum(int gnum) {this.gnum = gnum;}
	public String getGname() {return gname;}
	public void setGname(String gname) {this.gname = gname;}
	public String getGtitle() {return gtitle;}
	public void setGtitle(String gtitle) {this.gtitle = gtitle;}
	public String getGcontent() {return gcontent;}
	public void setGcontent(String gcontent) {this.gcontent = gcontent;}
	public String getGfile() {return gfile;}
	public void setGfile(String gfile) {this.gfile = gfile;}
	public int getGsize() {return gsize;}
	public void setGsize(int gsize) {this.gsize = gsize;}
	public String getGwriter() {return gwriter;}
	public void setGwriter(String gwriter) {this.gwriter = gwriter;}
	
	

}
