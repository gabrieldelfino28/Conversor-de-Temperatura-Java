package model;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class App {
	
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		double c;
		double b;
		
		double f = Double.parseDouble(JOptionPane.showInputDialog(null, "\nConversor de Fahrenheit para Celsius\nDigite o valor de Fahrenheit: "));
		c=(f-32)*5/9;
		
		JOptionPane.showMessageDialog(null, "Valor Convertido: " + c+"ºCelsius");
		System.out.println("Valor Convertido: " + c+"ºCelsius");
		
		double k = Double.parseDouble(JOptionPane.showInputDialog(null,"\nConversor de Kelvin para Celsius\nDigite o valor de Kelvin: "));
		b = k-273.15;
		
		JOptionPane.showMessageDialog(null, "Valor Convertido: " + df.format(b) + "ºkelvin");
		System.out.println("Valor Convertido: " + b+"ºCelsius");
	}

}
