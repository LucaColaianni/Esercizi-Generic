package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter<T extends Number>{

	/*scrivere una classe java generica che prenda in input un array e implementi dei
	metodi che ritornino degli elementi filtrati in base a delle caratteristiche ( numeri
	pari, numeri dispari, numeri primi)*/
	
	//genero un array di tipo generico
	private List<T> array;

	public ArrayFilter(List<T> array) {
		super();
		this.array = array;
	}
	
	//utilizzo una lista perchè non sappiamo quanti numeri pari abbiamo
	//PARI
	public List<T> getNumeriPari(){
		List <T> numeriPari	 = new ArrayList<>();
		for (T numero : array) {
			
			if((Integer)numero % 2 == 0) {
				numeriPari.add(numero);
			}
		}
		return numeriPari;
	}	
	
	//DISPARI
	public List<T> getNumeriDispari() {
		List<T> numeriDispari = new ArrayList<>();
		for (T numero : array) {
			if ((Integer) numero % 2 != 0) {
				numeriDispari.add(numero);
			}
		}
		return numeriDispari;
	}
	
	//PRIMI
	//metodo che verifica se un numero è primo
	private boolean isPrime(int n) {
	    if (n <= 1) { 
	        return false; //se il numero è minore o uguale a 1 non è primo
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false; //se il numero è divisibile per un numero diverso da 1 e da se stesso non è primo
	        }
	    }
	    return true; //se il numero supera i test precedenti allora è primo
	}

	//metodo che restituisce una lista di numeri primi
	public List<T> getNumeriPrimi() {
	    List<T> numeriPrimi = new ArrayList<>();
	    for (T numero : array) {
	        if (isPrime(numero.intValue())) { //verifica se il numero è primo
	            numeriPrimi.add(numero);
	        }
	    }
	    return numeriPrimi;
	}
	
}

