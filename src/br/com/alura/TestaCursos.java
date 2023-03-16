package br.com.alura;

import java.util.List;

public class TestaCursos {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		
        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        
		System.out.println(javaColecoes.getAulas());
		
	}
}
