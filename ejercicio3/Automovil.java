package ejercicio1;

public class Automovil {
private String marca;
private String modelo;
private int a�o;
private double precio;
private float interes=(float) ((precio*100)/5);
private float comision=(float) ((precio*100)/19);
private float preciofinal;


public Automovil(String marca, String modelo, int a�o, double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.a�o = a�o;
	this.precio = precio;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getA�o() {
	return a�o;
}

public void setA�o(int a�o) {
	this.a�o = a�o;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
public double getPreciofinal() {
	return preciofinal;
}

public void setPreciofinal(float preciofinal) {
	this.preciofinal = (float) preciofinal;
	

}
public double getInteres() {
	return interes;
}

public void setInteres(float interes) {
	this.interes = (float) interes;
	
}
public double getComision() {
	return comision;
}

public void setComision(float comision) {
	this.comision = (float) comision;
	

}
public void mostrarDatos() {
	preciofinal= (float) ((precio*5/100)+(precio*19/100)+precio+100000);
	System.out.println("Marca: "+getMarca());
	System.out.println("Modelo: "+getModelo());
	System.out.println("A�o: "+getA�o());
	System.out.println("Precio original: "+getPrecio());
	System.out.println("Precio final con comisiones e intereses: "+getPreciofinal());
	
	
}





}
