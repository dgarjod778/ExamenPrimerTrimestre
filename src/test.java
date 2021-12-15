import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		double num;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número entero mayor de 0 (nº de filas)");
			num = keyboard.nextDouble();
			if ((num > 0) && (num % 1 == 0)) {
				for (int fila = 1; fila <= num; fila++) {
					for (int espacio = 1; espacio <= num - fila; espacio++) {
						System.out.print("**");
					}
					for (int asterisco = 1; asterisco <= fila; asterisco++) {
						System.out.print("--");
					}
					System.out.println();
				}
			} else {
				if ((num <= 0)) {
					System.out.println("No has introducido un número mayor de 0\n");
				} else {
					System.out.println("No has introducido un número entero\n");
				}
			}
		} while ((num <= 0) || (num % 1 != 0));

		keyboard.close();

	}

}