package com.hanbit.oop.Inheritance;

public class CellPhone extends Phone{
     protected boolean portable;
     protected String move;
     public static String KIND="휴대폰";
     public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove(String move) {
		return move;
	}
	public void setPortable(boolean portable) {
		if(portable){
			this.setMove("이동가능");
		}else{
			this.setMove("이동불가능");
		}
	}
     private boolean isPortable() {
		return portable;

	}
     
     @Override 
 	public String toString(){
 		return String.format("%s 이기 때문에 %s 상태로 %s 에게  %s번호로 %s %s를 사용해서 전화했다.", 
				KIND,move,name,phoneNo,brand,KIND);
 	}
     
}
