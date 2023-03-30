package com.example.generics;


public class ArrayRange<T extends Number> {

	/*Scrivere una classe generica che prenda in input un array e altri due parametri
	interi che fungeranno da indice superiore e indice inferiore e ritorni un sottoarray
	nel range indice inferiore indice superiore*/
	
	public T[] slice(T[] arr, int minIndex, int maxIndex) {
		//controllo se gli indici sono validi
		if(minIndex < 0 || maxIndex >= arr.length || minIndex > maxIndex) {
			throw new IllegalArgumentException("Indici non validi!");
		
		}
		//creo nuovo array per contenere gli elementi compresi tra i due indici
		int newArrLength = maxIndex - minIndex +1;
		//fun fact non si può creare un array generic impostando la lunghezza da una varaibile
		// "Cannot create a generic array of T" quindi l'ho dichiarato object e castato generic
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) new Object[newArrLength];
		for (int i = minIndex; i<= maxIndex; i++) {
			newArr[i - minIndex] = arr[i];
		}
		return newArr;
	}
		
	}
	
	
	
	
	

