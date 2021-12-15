import java.util.Scanner;

public class Exer2 {



	

	public int siguente(int n) {
		int d = n - 1, s = 0;
		if (n == 1 || n == 0) { // En caso de ser 0 o 1 no tiene suma por lo que devolvemos directamente 0.
			return 0;
		} else {
			while (d > 0) {
				if (n % d == 0) { // compara si el resto es 0, si es así realiza la suma.
					s = s + d;
				}
				d--;
			}
			return s;
		}

	}

	public void ejercicio2(int n) {
		do {
			System.out.println(n);
			n = siguente(n);
		} while (siguente(n) > 0);

		System.out.println("1"); // En todos los dos ultimos numeros van a ser 1 y 0, por lo que los introduzco
									// de forma manual.
		System.out.println("0");
	}

}
