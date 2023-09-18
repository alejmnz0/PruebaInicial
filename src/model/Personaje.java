package model;

import java.util.Objects;

public class Personaje {
	
	String nombre;
	int vida, puntos, puntosFuerza;
	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}

	Mochila mochila;
	
	public Personaje() {
		super();
	}

	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.vida = 100;
		this.puntos = 0;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", puntos=" + puntos + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntos, vida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(nombre, other.nombre) && puntos == other.puntos && vida == other.vida;
	}
	
	public int recibirGolpe (int daño) {
		vida-=daño;
		return vida;
	}
	
	public void curar () {
		if (mochila.buscarBotiquin()) {
			vida+=10;
			System.out.println(nombre+" se ha curado 10 puntos de vida");
		} else {
			System.out.println("No tienes botiquines disponibles.");
		}
	}
	
	
	
	

}
