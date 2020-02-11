package ejercicio4;

public class Empleado {
		protected String rut;
		protected String nombre;
		protected String apellidos;
		protected String direccion;
		protected int telefono;
		protected double sueldo;
		
		
public Empleado(String rut, String nombre, String apellidos, String direccion, int telefono, double sueldo) {
			super();
			this.rut = rut;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direccion = direccion;
			this.telefono = telefono;
			this.sueldo = sueldo;
		}


public String getRut() {
	return rut;
}


public void setRut(String rut) {
	this.rut = rut;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public int getTelefono() {
	return telefono;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}


public double getSueldo() {
	return sueldo;
}


public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public String mostrarDatos() {
	return "rut: "+rut+"\n nombre: "+nombre+"apellidos: "+apellidos+"direccion: "+direccion+"telefono: "+telefono+"sueldo: ";
	
	
}
}


	
