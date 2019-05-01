package br.edu.ifpb.poo.pilha;

import java.util.LinkedList;

public class Pilha {
	
	private LinkedList<Peca>pecas=new LinkedList<Peca>();
	
	public void insere(Peca peca) {
		this.pecas.add(peca);
	}
	
	public Peca remove() {
		return this.pecas.remove(this.pecas.size()-1);
		
	}
	
	public boolean vazia() {
		return this.pecas.size()==0;
		
	}

}
