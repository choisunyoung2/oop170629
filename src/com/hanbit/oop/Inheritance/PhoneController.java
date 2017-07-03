package com.hanbit.oop.Inheritance;

import javax.swing.JOptionPane;

public class PhoneController {

	public static void main(String[] args) {
		CellPhone p=new CellPhone();  
		CellPhone nokia=new CellPhone();
		Iphone ip=new Iphone();
		AndroidPhone ap=new AndroidPhone();
		while(true){
			switch(JOptionPane.showInputDialog("enter 1. home calling.2. cellphone calling 3. messing sending 4.android 카톡 0.exit.")){
			 case "0":
				 JOptionPane.showInputDialog(null, "no call -- exit");
			  return;
			  case "1":
		      p.setName(JOptionPane.showInputDialog("name"));
		      p.setPhoneNo(JOptionPane.showInputDialog("phoneNo"));
		      p.setBrand(JOptionPane.showInputDialog("brand"));  
		      p.setCall(JOptionPane.showInputDialog("call"));
		
		      JOptionPane.showMessageDialog(null,p.toString());
             break;	
			  case "2":
				  nokia.setName(JOptionPane.showInputDialog("name"));
				  nokia.setPhoneNo(JOptionPane.showInputDialog("phoneNo"));
				  nokia.setBrand(JOptionPane.showInputDialog("brand"));
				  nokia.setCall(JOptionPane.showInputDialog("call"));
				  nokia.setPortable(true);
			      JOptionPane.showMessageDialog(null,nokia.toString());
				  break;
			  case "3":
				  ip.setName(JOptionPane.showInputDialog("name"));
				  ip.setBrand(JOptionPane.showInputDialog("brand"));
				  ip.setPhoneNo(JOptionPane.showInputDialog("phoneNo"));
				  ip.setData(JOptionPane.showInputDialog("data message"));
				  ip.setPortable(true);
				  JOptionPane.showMessageDialog(null,ip.toString());
				  break;
			  case "4":
				  ap.setName(JOptionPane.showInputDialog("name"));
				  ap.setBrand(JOptionPane.showInputDialog("brand"));
				  ap.setPhoneNo(JOptionPane.showInputDialog("phoneNo"));
				  ap.setData(JOptionPane.showInputDialog("data message"));
				  ap.setPortable(true);
				  ap.setSize(JOptionPane.showInputDialog("data size"));
				  ap.setAppl(JOptionPane.showInputDialog("카톡이라고 적어주세요"));
				  JOptionPane.showMessageDialog(null,ap.toString());
				  break;
		}

	  }
	}
}
