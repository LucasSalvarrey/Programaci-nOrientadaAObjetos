package ej2herencia;

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
		return true;
	}
	//if(this.VerEstado() && celular.VerEstado())
	//if(this.getPerdidaBateria()*duracion
	//<celular.getBateria())
	//mostrar "llamada exitosa";
	//else
	//mostrar "la llamada dura mas que la bateria disponible";
	//else
	//mostrar "alguno de los dos celulares esta apagado";
	//this.setBateria(this.getBateria-)
	public boolean VerEstado() {
		return true;
	}
	//if (this.getBateria()==0)
	//return false;
	//else
	//return true;
	public void RegargarCelular(){
		
	}
}
