import java.util.Scanner;
public class main1 {

	public static void main(String[] args) {
		int ancho;
		String color1 = "\u001B[41m";
		String color2 = "\u001B[42m";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la anchura del triangulo0");
		ancho = sc.nextInt();

		//figura(ancho, color1, color2);
//		ejercicio1();		
		Exer1 exer1 = new Exer1();
		exer1.figura(ancho, color1, color2);
		
		exer1.ejercicio1();
	}

}
