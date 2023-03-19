package br.com.alura;

import java.util.*;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
        
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        
        
        
        System.out.println(alunos.size());
	}

}
