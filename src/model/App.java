package model;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class App {
	
	public static double fahrenheit(double f) { //M�todo do calculo de converter fahrenheit em celsius
		return (f-32)*5/9;
	}
	
	public static double kelvin(double k) {//M�todo do calculo de converter kelvin em celcius
		return k-273.15;
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double f = Double.parseDouble(JOptionPane.showInputDialog(null, "\nConversor de Fahrenheit para Celsius\nDigite o valor de Fahrenheit: "));

		
		JOptionPane.showMessageDialog(null, "Valor Convertido: " + fahrenheit(f) +"�Celsius");
		System.out.println("Valor Convertido: " + fahrenheit(f) +"�Celsius");
		
		double k = Double.parseDouble(JOptionPane.showInputDialog(null,"\nConversor de Kelvin para Celsius\nDigite o valor de Kelvin: "));
		
		
		JOptionPane.showMessageDialog(null, "Valor Convertido: " + df.format(kelvin(k)) + "�kelvin");
		System.out.println("Valor Convertido: " + df.format(kelvin(k))+"�Celsius");
	}

}
