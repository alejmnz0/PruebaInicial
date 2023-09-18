package main;

import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			Random random = new Random ();
			System.out.println(random.nextInt(1, 4
					)); 
		}
		
	}

}
