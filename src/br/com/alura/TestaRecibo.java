package br.com.alura;

public class TestaRecibo {
	public static void main(String[] args) {
		
		//Set<int> arquivoRecibos = new HashSet<>();
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		Recibo rec1 = new Recibo(174 , 50);
		// atribui valores
		Recibo rec2 = new Recibo(753 , 30);
		// atribui valores
		Recibo rec3 = new Recibo(222 , 25);
		// atribui valores
	
		//List<String> letras = new LinkedList<>();
		//rec1.add();
		//rec2.add();
		//rec3.add();

		//letras.forEach(letra -> {
		//    System.out.println(letra);
		//});
		
		System.out.println(rec1);
		System.out.println("Todos os recibos");
	}
}
