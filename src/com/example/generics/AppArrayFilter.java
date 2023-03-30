package com.example.generics;

import java.util.List;

public class AppArrayFilter {

	public static void main(String[] args) {

		/*scrivere una classe java generica che prenda in input un array e implementi dei
		metodi che ritornino degli elementi filtrati in base a delle caratteristiche ( numeri
		pari, numeri dispari, numeri primi)*/
		
		//Integer[] array = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> lista = List.of(
				1,2,3,4,5,6,7,8,9,10
				);
				
		
        ArrayFilter<Integer> filter = new ArrayFilter<Integer>(lista);  
        System.out.println("I numeri pari sono: "+filter.getNumeriPari()); 
        System.out.println("I numeri dispari sono: "+filter.getNumeriDispari()); 
        System.out.println("I numeri primi sono: "+filter.getNumeriPrimi()); 


		
	}

}
