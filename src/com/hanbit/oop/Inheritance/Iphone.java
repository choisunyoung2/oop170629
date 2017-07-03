package com.hanbit.oop.Inheritance;

public class Iphone extends CellPhone{
	private String data;
	public static String BRAND="아이폰";
	public static String KIND="스마트폰";
	
	public void setData(String data){
		this.data=data;
		portable=true;
	}
	public String getData(){
		return data;
	}
	
	@Override 
	 	public String toString(){
	 		return String.format("%s 이기 때문에 %s 상태로 %s 에게  %s번호로 %s %s를 사용해서 %s이라고 문자를 전송했다.", 
					KIND,move,name,phoneNo,brand,KIND,getData());
	 	}
}
