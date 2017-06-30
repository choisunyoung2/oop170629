package com.hanbit.oop.domain;

import java.util.Scanner;
import javax.swing.*;

import com.hanbit.oop.domain.*;
public class MemberController {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		MemberService ms=new MemberService();
		MemberBean member=new MemberBean();
		while(true){
			switch(JOptionPane.showInputDialog("enter 1. join.  2. login . 0.exit.")){
			 case "0":
				 JOptionPane.showInputDialog("exit");
			  return;
			  case "1":
		member.setName(JOptionPane.showInputDialog("name"));
		member.setId(JOptionPane.showInputDialog("id"));
		member.setPass(JOptionPane.showInputDialog("pass"));
		member.setSsn(JOptionPane.showInputDialog("ssn"));
		JOptionPane.showMessageDialog(null,ms.join(member));
            break;			  
		    case "2":
		    	member = new MemberBean();
		    	member.setId(JOptionPane.showInputDialog("logid"));
		    	member.setPass(JOptionPane.showInputDialog("logpass"));
		    	JOptionPane.showMessageDialog(null,ms.login(member));
			    break;
		
		}

	  }
	}

}
