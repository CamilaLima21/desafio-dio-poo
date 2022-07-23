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
		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(m1);
		
		Bootcamp b1 = new Bootcamp();
		b1.setNome("Bootcamp JAVA Developer");
		b1.setDescricao("Descrição Java Developer");
		b1.getConteudos().add(c1);
		b1.getConteudos().add(c2);
		b1.getConteudos().add(m1);
		
		Dev d1 = new Dev();
		d1.setNome("Camila");
		d1.inscreverBootcamp(b1);
		System.out.println("Aluno(a) - " + d1.getNome());
		System.out.println("Matriculas - " + b1.getNome());
		d1.progredir();
		d1.progredir();
		System.out.println("------------------------");
		System.out.println("Conteúdos inscritos - " + d1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos - " + d1.getConteudosConcluidos());
		System.out.println("XP - " + d1.calcularTotalXp());
		
		System.out.println();
		
		Dev d2 = new Dev();
		d2.setNome("João");
		d2.inscreverBootcamp(b1);
		System.out.println("Aluno(a) - " + d2.getNome());
		System.out.println("Matriculas - " + b1.getNome());
		d2.progredir();
		System.out.println("------------------------");
		System.out.println("Conteúdos inscritos - " + d2.getConteudosInscritos());		
		System.out.println("Conteúdos concluídos - " + d2.getConteudosConcluidos());
		System.out.println("XP - " + d2.calcularTotalXp());
	}

}
