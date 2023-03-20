package br.com.alura;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Recibo {
  private int numeroRecibo;
  private int valorRecibo;
 // private List<Recibo> aulas = new LinkedList<Recibo>();
//	private Set<Recibo> alunos = new HashSet<>();

  public Recibo(int numeroRecibo , int valorRecibo) {
	this.numeroRecibo = numeroRecibo;
	this.valorRecibo = valorRecibo;
}

public int getNumeroRecibo() {
	return numeroRecibo;
}

  public int getValorRecibo() {
	return valorRecibo;
}
  
  
}
