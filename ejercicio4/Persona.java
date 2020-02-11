package ejercicio4;


public class Persona {
	public static void main(String []args) {
	
		Empleado misempleados[] = new Empleado[2];
	
		
misempleados [0] =new Privado("123456787", "Francisco", "Risopatron de Lourdes","Juan Bosco 1786", 976834616, 6000000, "Municipalidad de Los Alamos", "Administrativo");
misempleados [1] =new Publico("152423566", "Fernando", "Mellado Salinas","Los laureles 45", 945281947, 780000, "Comuna de las Condes", "Gerencia");

for(Empleado empleado: misempleados) {
	System.out.println(empleado.mostrarDatos());
	System.out.println("...................");
	
	
}
	}
	}
