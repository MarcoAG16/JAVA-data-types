package dataTypes;
import java.lang.Float;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos

		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 * 
		 * 
		 * */
		
		//Vmin y VMax
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor minimo de byte es: "+maxByte);
		System.out.println("El valor maximo de byte es: "+maxByte);
		
		//Short. Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort= Short.MAX_VALUE;
		System.out.println("El valor minimo de short es: "+maxShort);
		System.out.println("El valor maximo de short es: "+maxShort);
		
		//Char. Vmin y Vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de character es: "+ minChar);	
		System.out.println("El valor maximo de character es: "+ maxChar);	
		
		
		//Long. Vmin y Vmax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor minimo de long es: "+ Long.MIN_VALUE);
		System.out.println("El valor maximo de long es: "+ Long.MAX_VALUE);
		
		
		long isbn = 9788499169019L;
		System.out.println(isbn);

		
		
		//float. Vmin y Vmax
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor minimo de float es: "+ minFloat);	
		System.out.println("El valor maximo de float es: "+ maxFloat);
		
		
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor minimo de double es: "+ minDouble);	
		System.out.println("El valor maximo de double es: "+ maxDouble);	
		
		
		
		
		float salary = 15000f;
		System.out.println(salary);
		
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		int edad = 24;
		System.out.println(edad);
		
		char valorChar1 = 'a';
		char valorChar2 = '3';
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita; 
		aChiquita = 166;
		System.out.println(aChiquita);
		
		
		/*Casteo(Conversion de tipos en Java).
		 * --Automatico (dato mas pequenio a un dato mas grande)
		 * --Manuel (tipo de dato mas grande a tipo de dato mas pequenio)
		 * 
		 * 
		 * 
		 * 
		 * */
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double 
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//Manual
		int myNewCasting = (int)myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int 
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//conversion
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		// convertir de chat a int
		char myChat = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);

		
	}

}
