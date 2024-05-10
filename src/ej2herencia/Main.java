package ej2herencia;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona catalina=new Persona("Catalina");
		Persona julieta=new Persona("Julieta");
		Iphone iphone=new Iphone("2023",catalina,"17.0");
		Motorola motorola=new Motorola("2023",julieta,"7.9");
		
		if (iphone.HacerLlamada(15, motorola)) {
			JOptionPane.showMessageDialog(null, "El Motorola le resta "+motorola.getBateria());
			JOptionPane.showMessageDialog(null, "El Iphone le resta "+iphone.getBateria());
		} else {
			JOptionPane.showMessageDialog(null, "No se realizo la llamada.");
		}
	}

}
