package proje3;

import java.util.Scanner;

public class B�l�mVeKalanBulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("b�l�neni giriniz = ");
		
		int b�l�nen = scan.nextInt();
		
		 System.out.println("B�leni giriniz= ");
		 
		 int b�len = scan.nextInt();
		 
		 int b�l�m = b�l�nen/b�len;
		 
		 int kalan = b�l�nen%b�len;
		 
		 System.out.println("b�l�m= "+b�l�m   +   "    kalan:"   +  kalan);
		 
		 
		
		
		
		
		
		

	}

}
