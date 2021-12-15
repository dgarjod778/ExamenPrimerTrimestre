import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.printf("Dime un numero para jugar con sus divisores.\nNumero: ");

		n = sc.nextInt();
		Exer2 Exer2 = new Exer2();
		System.out.println(Exer2.siguente(n));

		Exer2.ejercicio2(n);
		
		

	}



}
