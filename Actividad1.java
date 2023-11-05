package main;
import java.util.Scanner;

public class Actividad1 {
	
	public enum Dia {LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime un número y te diré a que día corresponde: ");
		int num = scanner.nextInt();
		scanner.close();
		
		switch (num) {
		case 1:
			System.out.println("Es LUNES");
		break;
		
		case 2:
			System.out.println("Es MARTES");
		break;
		
		case 3:
			System.out.println("Es MIÉRCOLES");
		break;
		
		case 4:
			System.out.println("Es JUEVES");
		break;
		
		case 5:
			System.out.println("Es VIERNES");
		break;
		
		case 6:
			System.out.println("Es SÁBADO");
		break;
		
		case 7:
			System.out.println("Es DOMINGO");
		break;
		
		default:
		System.out.println("Pon otro número, ese no corresponde al intervalo de los días de la semana (1 al 7");
		
		
		
		}
		
		

	}

}
