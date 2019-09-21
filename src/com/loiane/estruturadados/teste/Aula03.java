package com.loiane.estruturadados.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		try {
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
