package com.hanbit.oop.Inheritance;

public class AndroidPhone extends Iphone {
	//brand galaxy note
	//data overriding --카톡메세지
	private String size,appl;
	public static String BRAND="갤럭시노트";
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
		setPortable(true);
	}
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	@Override 
 	public String toString(){
 		return String.format("%s 이기 때문에 %s 상태로 %s 에게  %s번호로 %s %s를 사용해서 %s이라고 %s 을 전송했다.", 
				KIND,move,name,phoneNo,BRAND,getSize(),getData(),getAppl());
 	}
}
