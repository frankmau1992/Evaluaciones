package ejercicio4;

public class Privado extends Empleado {
	private String comuna;
	private String empresa;
	
	public Privado(String rut, String nombre, String apellidos, String direccion, int telefono, double sueldo, String comuna, String empresa) {
		super(rut, nombre, apellidos, direccion, telefono, sueldo);
		this.comuna = comuna;
		this.empresa = empresa;
		
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
public String mostrarDatos() {
	return "rut: "+rut+"\n nombre: "+nombre+"\n apellidos: "+apellidos+"\n direccion: "+direccion+"\n telefono: "+telefono+"\n sueldo: "+sueldo+"\n comuna: "+comuna+"\n empresa: "+empresa;
	
}
	
	
}
