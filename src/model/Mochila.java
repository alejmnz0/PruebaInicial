package model;

import java.util.ArrayList;
import java.util.Objects;

public class Mochila {
	
	ArrayList<String> elementos;
	int nroElementos;
	
	
	
	@Override
	public String toString() {
		return "Mochila [elementos=" + elementos + ", nroElementos=" + nroElementos + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(elementos, nroElementos);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mochila other = (Mochila) obj;
		return Objects.equals(elementos, other.elementos) && nroElementos == other.nroElementos;
	}



	public ArrayList<String> getElementos() {
		return elementos;
	}



	public int getNroElementos() {
		return nroElementos;
	}



	public Mochila() {
		super();
	}



	public Mochila(ArrayList<String> elementos, int nroElementos) {
		super();
		this.elementos = elementos;
		this.nroElementos = nroElementos;
	}



	public String agregarAMochila (String objeto) {
		if (elementos.size()<10) {
			elementos.add(objeto);
			return "Tienes "+elementos.size()+" elementos en la mochila";
		}else {
			return "YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA";
		}
	}
	
	public boolean buscarBotiquin () {
		String botiquin="BOTIQUIN";
		return elementos.contains(botiquin);
	}

}
