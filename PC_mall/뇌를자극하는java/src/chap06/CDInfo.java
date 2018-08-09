package chap06;

public class CDInfo {

	String registerNo; //관련번호
	String title;      //타이틀
	CDInfo(String registerNo, String title) {
		super();
		this.registerNo = registerNo;
		this.title = title;
		
		System.out.println("=========String registerNo, String title, String writer");
	}
}
