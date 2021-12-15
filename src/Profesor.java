
public class Profesor {
	private String nombre;
	private String apellido;
	private int horasTrabajadas;

	public Profesor() {
		nombre = "Sin datos";
		apellido = "Sin datos";
		horasTrabajadas = 0;

	}

	void setNombre(String nombre) {
		if (nombre.matches("[^A-Z]{1}") == false) {
			this.nombre = "No valido";
		} else {
			this.nombre = nombre;
		}
	}

	void setApellido(String apellido) {
		if (nombre.matches("[^A-Z]{1}") == false) {
			this.apellido = "no valido";
		} else {
			this.apellido = apellido;
		}
	}

//	void contardor(int counter) {
//		counter
//	}
//	
//	String contarProfesores(String nombre) {
//		int numeroProfesores=;
//		String ;
//		return "Soy el profesor "+this.nombre+"y soy el numero"+ ;
//		
//	}

	void incrementoHoras(int horas, String nombre) {
		if (this.nombre == nombre) {
			this.horasTrabajadas = horas;
		}

	}
	
	void duplicarHoras( ) {
		this.horasTrabajadas=this.horasTrabajadas*2;
	}

}