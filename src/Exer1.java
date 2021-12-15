import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
//		int ancho;
//		String color1 = "\u001B[41m";
//		String color2 = "\u001B[42m";
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime la anchura del triangulo0");
//		ancho = sc.nextInt();
//
//		/figura(ancho, color1, color2);
////		ejercicio1();
	}

	public void figura(int ancho, String color1, String color2) {

		int i;

		do {
			for (int fila = 1; fila <= ancho; fila++) {
				for (int espacio = 0; espacio <= ancho - fila; espacio++) {
					System.out.print(color1 + "  ");
				}
				for (int asterisco = 2; asterisco <= fila; asterisco++) {
					System.out.print(color2 + "  ");
				}
				System.out.println();
			}

		} while ((ancho <= 0) || (ancho % 1 != 0));

	}

	public void ejercicio1(){
		String color1 = "\u001B[41m";
		String color2 = "\u001B[42m";
		String RESET = "\u001B[0m";
		int repeticiones,i, ancho;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println(RESET +"Dime que ancho quieres usar");
		ancho=sc.nextInt();
		
		System.out.println("Dime cuantas veces quieres que haga la figura");
		repeticiones=sc.nextInt();
		
		for(i=1;i<repeticiones;i++) {
			if(i%2==0) {
				figura(ancho, color1, color2);
			}else {
				figura(ancho, color2, color1);
			}
		}
	}
}
