package proje4;

import java.util.Scanner;

public class YaziliPuaniNotaCevirme {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Notunuzu Giriniz:  ");
		
		int not = scan.nextInt();
		
		if (not <=19) {
			System.out.println("notunuz= EE");
			
		}else if (not <=40 ) {
			System.out.println("notunuz = DD");
			
		}else if (not<=60 ) {
			System.out.println("notunuz= CC");
			
		}else if(not<=70) {
			System.out.println("notunuz= CB");
			
		}else if (not<=80) {
			
			System.out.println("notunuz= BB");
		}else if (not<=90) {
			
			System.out.println("notunuz= BA");
			
		}else if (not<=100) {
			System.out.println("notunuz = AA");
			
		}else {
			System.out.println("yanlis bir bilgi girdiniz");
		}
		
		
		
		
		
		
		
		
		

	}

}
