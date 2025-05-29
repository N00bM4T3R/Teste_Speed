package aplication;

import java.util.ArrayDeque;
import java.util.Scanner;



public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vect = new Integer[100000000];
	
		int n = 99999999;
		for (int i = 0; i < 100000000; i++) {
            vect[i] = i ;
		}
	
    
		binary(vect, n);
		System.out.println(linear(vect, n));
	
		
		

	}
	public static int linear( Integer[] vect, Integer number) {
		
	   for (int i =0; i< vect.length ; i++) {
		   if(vect[i].doubleValue() == number) {
			   return vect[i];
			   
		   }
		   
	   }
	   return 0;
	   
		
	}
	public static  int binary(Integer[] vect, Integer item) {
		int low = 0;
		int high = vect.length;
		while (low <= high ) {
			int middle = (low + high) /2;
			int kick = vect[middle];
			
			if (kick == item) {
				 System.out.println("posição encontrada: " + kick); 
				return kick;
				
				
			}
			else if ( kick > item) {
				high = middle -1;
				
			}
			else {
				low =middle +1;
			}
		
			
			
		}
		return 0;
		
		
		
		
		
	}
	

	}
