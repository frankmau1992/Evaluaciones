package ejercicio2;

public class Empleado1 {

	private String rut;
	private String cargo;
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String direccion;
	private int fono; 
	private String email;
	
	public Empleado1(String rut, String cargo, String nombre, String apellidop, String apellidom) {
		super();
		this.rut = rut;
		this.cargo = cargo;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
	}

	public Empleado1(String rut, String apellidop, String apellidom, String direccion, int fono, String email) {
		super();
		this.rut = rut;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.direccion = direccion;
		this.fono = fono;
		this.email = email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
