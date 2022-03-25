package controller;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random generator = new Random();
		int v[] = new int[10];
		
		// Filling the vector
		for(int i=0; i<v.length; i++) v[i] = generator.nextInt(26);
		
		// Showing the vector before sorting
		System.out.printf("Out of order: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
		
		bubbleSort(v);
		
		// Showing the vector after sorting 
		System.out.printf("\n\nSorted: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
	}
	
	public static void bubbleSort(int v[]){
		int aux, end = v.length;
		boolean change = true;
		
		while(change){
			change = false;
			end--;
			for(int i=0 ; i < end; i++){

				// The operator turned to the right puts the vector in ascending order
				// The operator facing left puts the vector in descending order
				if(v[i]>v[i+1]){
					aux = v[i];
					v[i] = v[i+1];
					v[i+1] = aux;
					change = true;
				}
			}
		}
	}
}
