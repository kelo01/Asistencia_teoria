package ar.edu.unju.fi.main;
import ar.edu.unju.fi.model.*;
import java.util.*;
public class Main {
	public static void main(String[] arg) {

		Alumno alumno= generarAlumno();
	
		registrarNotas(alumno,2);
		
		
	}

	public static Alumno generarAlumno() {
		Scanner scanner = new Scanner (System.in);
		Alumno alumno = new Alumno();
		Materia materia = new Materia();
				
		System.out.println("Ingrese el legajo:");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido:");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.next();
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
		
	}
	public static void registrarNotas(Alumno alumno ,int numMaterias ) {
		Scanner scanner = new Scanner (System.in);
		int i = 1;
		while ( i <= numMaterias ) {
			System.out.println("Ingrese el codigo de la materia");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia");
			String nombreMateria = scanner.next();
			Materia materia = new Materia (codigoMateria, nombreMateria);
			System.out.println("Ingrese el codigo del registro de la nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			System.out.println(registroNota.toString());
			System.out.println();
			
			i++;
			
			}
		
		
	}
	

}
