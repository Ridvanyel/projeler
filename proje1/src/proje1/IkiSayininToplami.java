package proje1;

import java.util.Scanner;

public class IkiSayininToplami {
	
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Birinci sayiyi giriniz: ");
		
		int sayi1 = scan.nextInt();
		
		System.out.println("Ikinci sayiyi girniz: ");
		
		int sayi2 = scan.nextInt();
		
		int toplam = sayi1+sayi2;
		
		System.out.println("Sonuc = " + toplam);
		
		
		
		
		
		
	}
	

}
