import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		String cadena1, cadena2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una cadena.");

		cadena1 = sc.nextLine();

		System.out.println("Dime los caracteres que quieres contar");

		cadena2 = sc.nextLine();

		System.out.println(compararCadena(cadena1, cadena2));

	}

	public static int compararCadena(String cadena1, String cadena2) {
		int i, j, x, cont = 0;
		boolean igual;
		String comparar1 = cadena1.toLowerCase(), comparar2 = cadena2.toLowerCase(); // paso todo los caracteres a
																						// minuscula

		for (i = 0; i < comparar1.length(); i++) {
			igual = false;

			if (comparar1.charAt(i) == comparar2.charAt(0)) { // recorre toda la cadena 1 en busca del primer caracter,
																// si es así, comprueba los demas caracteres .
				x = i;
				for (j = 1; j < comparar2.length(); j++) {
					x++;
					if (comparar1.charAt(x) == comparar2.charAt(j)) {
						igual = true;

					} else {
						igual = false;
					}
				}

			}

			if (igual == true) {
				cont++;
			}
		}

		return cont;

	}

}
