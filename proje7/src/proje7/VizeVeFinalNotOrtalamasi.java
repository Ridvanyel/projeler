package proje7;

import java.util.Scanner;

public class VizeVeFinalNotOrtalamasi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lütfen vize notunuzu girniz:  ");
		
		int vize = scan.nextInt();
		
		System.out.println("lütfen final notunuzu giriniz:  ");
		
		int finalnotu = scan.nextInt();
		
		double notOrt= (vize+finalnotu)/2;
		
		System.out.println("not ortlamaniz :"  + notOrt);
		
		
		if (notOrt<50) {
			
			System.out.println("dersten kaldiniz....");
		}else {
			
			System.out.println("dersten gectiniz....");
		}
		
		
		
		
		
	}

}
