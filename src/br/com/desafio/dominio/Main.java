package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c1 = new Curso();
		c1.setTitulo("Java");
		c1.setDescricao("Descrição curso Java");
		c1.setCargaHoraria(8);
		
		Curso c2 = new Curso();
		c2.setTitulo("JS");
		c2.setDescricao("Descrição curso JS");
		c2.setCargaHoraria(4);
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Mentoria de Java");
		m1.setDescricao("Descrição mentoria Java");
		m1.setData(LocalDate.now());
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m1);
		
	}

}
