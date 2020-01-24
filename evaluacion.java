package Guia1;

import java.util.Scanner;

public class evaluacion {
	

	public static void main(String[] args) {

		Scanner src= new Scanner (System.in);
		
		System.out.println("Ingrese una de las siguientes opciones");
		System.out.println("1.Secuencial");
		System.out.println("2.Condicional Si entonces");
		System.out.println("3.Condicional Si entonces anidado");
		System.out.println("4.Condicional Segun");
		System.out.println("5.Repetitiva Mientras");
		System.out.println("6.Repetitiva Repetir");
		System.out.println("7.Repetitiva Para");
		System.out.println("8.Arreglo Simple");
		System.out.println("9.Arreglo Bidimensional");
		System.out.println("10.Salir");
		int num= src.nextInt();

		
		
		//PRIMER EJERCICIO EN JAVA
		
	    int num1, num2, num3;
		if (num==1) {
		System.out.println("Calcular promedio de 3 numeros");
		System.out.println ("Ingrese Numero 1") ;
		num1 = src.nextInt() ;
		System.out.println ("Ingrese Numereo 2") ;
		num2 = src.nextInt() ;
		System.out.println ("Ingrese Numero 3") ;
		num3 = src.nextInt() ;
		int suma = (num1 + num2 + num3) ;
		int promedio = (suma/3);
		
		System.out.println("El promedio es " +promedio );
		}
		
		//SEGUNDO EJERCICIO EN JAVA
		

		Scanner sc = new Scanner(System.in);
		if(num==2) {
		System.out.println("Sistema 3000 para derivar al baño");		
		System.out.println("\"Indique su nombre\"");
		String nombre = sc.next();
		System.out.println("\"Porfavor ingrese su genero H para Hombre o M para Mujer\"");
		String genero = sc.next();
		
			
		if(genero.equals("m") || genero.equals("M")){
			genero="M";
			System.out.println("Srta."+nombre+"/Debe dirigirse al baño de damas.");
			
		}
		if(genero.equals("h") || genero.equals("H")){

				genero="H";
				System.out.println("Don."+nombre+"/Debe dirigirse al baño de caballeros.");
				
		}	
		}
		
		//TERCER EJERCICIO EN JAVA
		
		if(num==3) {
		System.out.println("Sistema 3000 para derivar al baño o ducha");		
		System.out.println("\"Indique su nombre\"");
		String nombre = sc.next();
		System.out.println("\"Porfavor ingrese su genero H para Hombre o M para Mujer\"");
		String genero = sc.next();
		System.out.println("\"Desea utilizar baño o ducha?");
		System.out.println("\"Ingrese B para baño y D para ducha");
		String servicio= sc.next();
			
		if(genero.equals("m") || genero.equals("M")){
			genero="M";
			if(servicio.equals("D") ||servicio.equals("D")){
				servicio="D";
				System.out.println("Srta."+nombre+"/Debe dirigirse al baño de damas y el valor es de $ 2500.");
			}
			
						if(servicio.equals("b") ||servicio.equals("B")){
							servicio="B";
							System.out.println("Srta."+nombre+"/Debe dirigirse al baño de damas y el valor es de $ 250.");

						}

		}
		if(genero.equals("h") || genero.equals("H")){
			genero="H";
			if(servicio.equals("D") ||servicio.equals("D")){
				servicio="D";
			
				System.out.println("Don."+nombre+"/Debe dirigirse al baño de caballeros y el valor del servicio es de $ 2500.");
				
		}
			if(servicio.equals("b") ||servicio.equals("B")){
				servicio="B";
				System.out.println("Srta."+nombre+"/Debe dirigirse al baño de caballeros y el valor es de $ 250.");
	
		}
		
		}
		
	
	}
	//CUARTO EJERCICIO EN JAVA
		
		if(num==4) {
		System.out.println("Numero escrito en palabras");
		System.out.println("Ingrese un numero del 1 al 10");
		num1 = src.nextInt();
			

			
		}
	//QUINTO EJERCICIO JAVA
		
		
		
		}
	}

		
		
	


	
	
		


		
		
		
		
		
			
		
	
	

		
		
		
		
		
		
	
	
	
	


