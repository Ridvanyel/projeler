package proje3;

import java.util.Scanner;

public class BölümVeKalanBulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bölüneni giriniz = ");
		
		int bölünen = scan.nextInt();
		
		 System.out.println("Böleni giriniz= ");
		 
		 int bölen = scan.nextInt();
		 
		 int bölüm = bölünen/bölen;
		 
		 int kalan = bölünen%bölen;
		 
		 System.out.println("bölüm= "+bölüm   +   "    kalan:"   +  kalan);
		 
		 
		
		
		
		
		
		

	}

}
