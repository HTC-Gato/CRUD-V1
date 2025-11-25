package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Objeto  {
	private String nome;
	private List<String> objetos = new ArrayList();
	
	public String toString() {
		return nome;
	}

	public void adicionar(Scanner nome) {
		System.out.println("Digite");
		objetos.add(nome.nextLine());
		System.out.println("Adicionado!");
		System.out.println("---------------");
	}
	
	public void editar(Scanner teclado) {
		listar();
		System.out.println("Digite o numero de objeto que sera modificado");
		int n = teclado.nextInt();
		if (n >= 0 && n < objetos.size()) {
			System.out.println("Digite um novo item");
			objetos.set(n,   teclado.next());
			System.out.println("Objeto alterado com sucesso");
		}else {
			System.out.println("Tente novamente");
		}
		System.out.println("------------------");
	}
	
	public void listar() {
		if (objetos.isEmpty()) {
			System.out.println("Lista esta vazia!");
		}
		System.out.println("Lista de Objetos: ");
		for (int i = 0; i < objetos.size(); i++) {
			System.out.println(i + " - " + objetos.get(i));
		}
		System.out.println("--------------------------");
	}
	public void excluir() {
		objetos.removeAll(objetos);
		System.out.println("Todos os objetos excluidos");
	}
}


