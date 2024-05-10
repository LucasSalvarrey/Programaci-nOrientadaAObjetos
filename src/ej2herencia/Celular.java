package ej2herencia;

import javax.swing.JOptionPane;

public  abstract class Celular {
	private String marca;
	private String modelo;
	private double bateria;
	private double perdidaBateria;
	public Celular(String marca, String modelo, Persona persona, double bateria, double perdidaBateria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
		this.perdidaBateria = perdidaBateria;
	}
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getBateria() {
		return bateria;
	}


	public void setBateria(double bateria) {
		this.bateria = bateria;
	}


	public double getPerdidaBateria() {
		return perdidaBateria;
	}


	public void setPerdidaBateria(double perdidaBateria) {
		this.perdidaBateria = perdidaBateria;
	}


	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", perdidaBateria="
				+ perdidaBateria + "]";
	}
	public boolean HacerLlamada(int duracion, Celular celular) {
		if (this.VerEstado()&&celular.VerEstado()) {
			if (this.getPerdidaBateria()*duracion < this.getBateria() &&
					celular.getPerdidaBateria()*duracion < celular.getBateria()) {
				JOptionPane.showMessageDialog(null, "Llamada exitosa.");
				this.setBateria(this.getBateria()-this.getPerdidaBateria()*duracion);
				celular.setBateria(celular.getBateria()-celular.getPerdidaBateria()*duracion);
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "La llamada dura más que la bateria disponible.");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Alguno de los celulares esta apagado.");
			return false;
		}
		
	}
	public boolean VerEstado() {
		if (this.getPerdidaBateria()==0) {
			return false;
		} else {
			return true;
		}
		
	}
	public void RegargarCelular(){
		this.setBateria(5);
	}
}
