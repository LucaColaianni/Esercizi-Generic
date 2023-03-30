package com.example.generics;

import java.util.Arrays;

public class ArrayRangeApp {

	public static void main(String[] args) {
		  Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    int minIndex = 2;
		    int maxIndex = 7;
		    
		    //istanza
		    ArrayRange<Integer> arraySlicer = new ArrayRange<Integer>();
		    
		    //creo un nuovo array contenente gli elementi compresi
		    Integer[] slicedArr = arraySlicer.slice(originalArray, minIndex, maxIndex);
		    
		    System.out.println("Risultato: "+ Arrays.toString(slicedArr));

	}
}