package ejercicio4;

public class Publico extends Empleado {
	private String municipalidad;
	private String departamento;
	
	public Publico(String rut, String nombre, String apellido, String direccion, int telefono, double sueldo, String municipalidad, String departamento) {
		super(rut, nombre, apellido, direccion, telefono, sueldo);
		this.municipalidad = municipalidad;
		this.departamento = departamento;
		
	}


	public String getMunicipalidad() {
		return municipalidad;
	}

	public void setMunicipalidad(String municipalidad) {
		this.municipalidad = municipalidad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

@Override
	public String mostrarDatos() {
		return "rut: "+rut+"\n nombre: "+nombre+"\n apellidos: "+apellidos+"\n direccion: "+direccion+"\n telefono: "+telefono+"\n sueldo: "+sueldo+"\n municipalidad: "+municipalidad+"\n departamento: "+departamento;
		
	}
	}

	


