package proje2;

import java.util.Scanner;

public class OndalikliIkiSayininCarpimi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz:  ");
		
		double sayi1= scan.nextDouble();
		
		System.out.println("Ikinci sayiyi giriniz : ");
		
		double sayi2= scan.nextDouble();
		
		double carpim = sayi1*sayi2;
		
		System.out.println("Sonuc " + carpim);
		
		
		

	}

}
