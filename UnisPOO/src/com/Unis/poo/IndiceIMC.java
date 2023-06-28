package com.Unis.poo;
import javax.swing.*;
import java.text.DecimalFormat;

public class IndiceIMC {

	public static void main(String[] args) {	
		
		 String status = null;
 		 double weight = Double.parseDouble(JOptionPane.showInputDialog("Please, insert your Weight: "));
		 double height = Double.parseDouble(JOptionPane.showInputDialog("Please, insert you Height: "));
		
		 double IMC = weight/(height*height)*10000;
		 	
		 DecimalFormat number = new DecimalFormat("##.###");
		 
		 if(IMC<17) {
			 status = ("Muito Abaixo do Peso");
		 }else
			 
			 if(IMC>16 && IMC < 18.49) {
				 status = ("Abaixo do Peso");
			 }else
				 
				 if(IMC>18.50 && IMC < 24.99) {
					 
					 status = ("Peso normal");
				 }else
					 
					 if (IMC > 25.00 && IMC < 29.99) {
						 
						 status = ("Acima do Peso");
					 }else
						 
						 if(IMC > 30 && IMC < 34.99) {
							 
							 status = ("Obesidade 1");
						 }else
							 
							 if(IMC > 35 && IMC < 39.99) {
								 
								 status = ("Obesidade 2 (severa)");
							 }else
								 
								 if(IMC>39.99) {
									 
									 status = ("Obesidade 3(mórbida)");
								 }
		 
	
		JOptionPane.showMessageDialog(null, "O IMC é "+ number.format(IMC) +" Kg/m² \n Situação: " + status);
		
		

	}

}

