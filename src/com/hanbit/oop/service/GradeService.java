package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
     GradeBean g=new GradeBean();
     int sum=0,avg=0;
     public GradeService(){
    	 
     }
     
     public int getSum(){
        return sum=g.getEng()+g.getKor()+g.getMath();
     }
     public int avg() {
		return avg=getSum()/3; //g.getEng()+g.getKor()+g.getMath()
	}
    	 public String getcalcGrade() {
    			String result="";
    			if(this.avg()>=90){
    				result="수";
    			}else if(this.avg()>=80){
    				result="우";
    			}else if(this.avg()>=70){
    				result="미";
    			}
    			else if(this.avg()>=60){
    				result="양";
    			}
    			else{
    				result="가";
    			}
    			return result;
     }
     
}
