package proje5;

import java.util.Scanner;

public class FaktoriyelHesaplama {
	
	
	
	public static void faktoriyelHesaplama () {
		
		
Scanner scan = new Scanner (System.in);
		
		
		System.out.println("lütfen bir sayi giriniz=  ");
		
		int sayi = scan.nextInt();
		
		int faktoriyel= 1;
		
		while (sayi>=1) {
			
			faktoriyel=faktoriyel*sayi;
			
			sayi--;
			
			
		}
		
		System.out.println("sonuc= "+faktoriyel);
		
	}

	public static void main(String[] args) {
		
		
		faktoriyelHesaplama();
		
		
		
		
		
		

	}

}
