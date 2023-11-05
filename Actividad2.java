package main;
import java.util.Scanner;
public class Actividad2 {

	public enum Vehiculos {MOTO, COCHE, CAMIÓN, AUTOBÚS, BICICLETA}
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("[1] " + Vehiculos.MOTO);
		System.out.println("[2] " + Vehiculos.COCHE);
		System.out.println("[3] " + Vehiculos.CAMIÓN);
		System.out.println("[4] " + Vehiculos.AUTOBÚS);
		System.out.println("[5] " + Vehiculos.BICICLETA);
		System.out.println("Di un número de los que he dicho: ";);

		int num = scanner.nextInt();
		scanner.close();

		if (num <= 5 && num>=1){
			switch (num) {
            case 1:
                System.out.println("Usted ha seleccionado una " + Vehiculos.MOTO);
                break;
            
            case 2:
                System.out.println("Usted ha seleccionado un " + Vehiculos.COCHE);
                break;
            
            case 3:
                System.out.println("Usted ha seleccionado un " + Vehiculos.CAMIÓN);
                break;
            
            case 4:
                System.out.println("Usted ha seleccionado un " + Vehiculos.AUTOBÚS);
                break;
            
            case 5:
                System.out.println("Usted ha seleccionado una " + Vehiculos.BICICLETA);
                break;
            
            default:
                break;
			}
        
        }
		else{
			System.out.println("El número que has dicho no pertenece al intervalo, di otro:");
		}


    }			

}


