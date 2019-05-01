package br.edu.ifpb.poo.pilhaGenerica;

import java.util.LinkedList;

public class Pilha {
	
	private LinkedList<Object>objetos=new LinkedList<Object>();
	
	public void insere(Peca peca) {
		this.objetos.add(peca);
	}
	
	public Object remove() {
		return this.objetos.remove(this.objetos.size()-1);
		
	}
	
	public boolean vazia() {
		return this.objetos.size()==0;
		
	}

}
