package br.edu.ifpb.poo.pilhaParametrizada;

public class Teste {

	public static void main(String[] args) {

		Pilha<Peca>pilha=new Pilha<Peca>();
		
		Peca peca=new Peca();
		
		pilha.insere(peca);
		
		Peca pecaRemove = pilha.remove();
		
		if(pilha.vazia()) {
			System.out.println("A pilha está vazia");
		}
		
		Pilha<String>pilha2 = new Pilha<String>();
		pilha2.insere("Rafael Cosentino");
		pilha2.insere("Paulo Silvera");
		
		String paulo = pilha2.remove();
		String rafael = pilha2.remove();
		
		System.out.println(paulo);
		System.out.println(rafael);

	}

}
