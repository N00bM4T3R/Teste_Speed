package aplication;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vect = new Integer[100000000];
		Boolean stop = false;
		
		for (int i = 0; i < 100000000; i++) {
            vect[i] = i ;
		}
		
		int n = 99999999;
		for (int i1 = 0; stop == false; i1++ ) {
			if (n == vect[i1]) {
				System.out.println("numero encontrado: " + vect[i1]);
				stop = true;
				
			}
			// 1 second e 480 milesecons
		}
		
		

	}
	

	}
