package com.hanbit.oop.service;


public class BmiService {
	public String execute(Double tall,Double weight){
		 
		  Double bmi=weight/(tall*tall);
		  String weight_condition; 
		  if(bmi<18.5){
			   weight_condition="low weight";
		  }else if(bmi<25){
			 weight_condition="normal";
		  }else if (bmi<30.0){
			  weight_condition="heavy weight";
		  }else{
			 weight_condition="pig1";
		  }
	     return weight_condition;
   }
}
	
