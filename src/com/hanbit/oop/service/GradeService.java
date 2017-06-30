package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
     GradeBean g=new GradeBean();
     public GradeService(){
    	 
     }
     
     public int getSum(){
        return g.getEng()+g.getKor()+g.getMath();
     }
     public int avg() {
		return g.getEng()+g.getKor()+g.getMath()/3;
	}
    	 public String getcalcGrade() {
    			String result;
    			if(g.getEng()+g.getKor()+g.getMath()/3>=90){
    				result="수";
    			}else if(g.getEng()+g.getKor()+g.getMath()>=80){
    				result="우";
    			}else if(g.getEng()+g.getKor()+g.getMath()>=70){
    				result="미";
    			}
    			else if(g.getEng()+g.getKor()+g.getMath()>=60){
    				result="양";
    			}
    			else{
    				result="가";
    			}
    			return result;
     }
     
}
