package com.hanbit.oop.controller;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import com.hanbit.oop.service.BmiService;

public class BmiController {
     public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      BmiService s2= new BmiService();
   	   while(true){
   		  System.out.print("0.start. 1. stop \n");
   		  switch(s.next()){
   		  case "0":
   			System.out.print("end");
   			 break;
   		  case "1": 
   			 System.out.print("신장:enter your tall \n");
   		     Double tall=s.nextDouble();
   		     System.out.print("몸무게: enter your weight\n");				
   		     Double weight=s.nextDouble();
   			 String weight_condition = s2.execute(tall,weight);
   			 System.out.print("my bmi:"+weight_condition);
   	     
   		     return;
   		  }
   	  }	    
   }
        
}
