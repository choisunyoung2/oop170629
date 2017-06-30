package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeController {

	public static void main(String[] args) {
		GradeService service=new GradeService();
		GradeBean gb=new GradeBean();
		while(true){
			switch(JOptionPane.showInputDialog("enter 1. grade. 0.exit.")){
			 case "0":
				 JOptionPane.showInputDialog(null,"exit");
			  return;
			  case "1":
		gb.setName(JOptionPane.showInputDialog("name"));
		gb.setMajor(JOptionPane.showInputDialog("major"));
		gb.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng")));
		gb.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor")));
		gb.setMath(Integer.parseInt(JOptionPane.showInputDialog("math")));
		JOptionPane.showMessageDialog(null,String.format("%s 님의 성적은 %s 입니다",gb.getName(),service.getcalcGrade()));
           break;			 
		}
	  }
	}
}
