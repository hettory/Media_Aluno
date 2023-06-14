package Media_Aluno;

import java.util.Scanner;

public class MediaNotas {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		if(media >=9 && media <= 10) {
			aproveitamento = "A";
		}else if(media >=7.5 && media < 9) {
			aproveitamento = "B";
		
	   }else if(media >=6 && media < 7.5) {
			aproveitamento = "C";
	   
	   }else if(media >=4 && media < 6) {
			aproveitamento = "D";
	   
	   }else if(media >=0 && media < 4) {
			aproveitamento = "E";	
	   }	
		System.out.println("nota1:"+nota1);
		System.out.println("nota2:"+nota2);
		System.out.println("media:"+media);
		System.out.println("conceito:"+aproveitamento);
		
		
		switch(aproveitamento){
			case "A":
			case "B":
			case "C":System.out.println("Aprovado");break;
			case "D":
			case "E":System.out.println("Reprovado");break;
		}
		
		
	}
 }

