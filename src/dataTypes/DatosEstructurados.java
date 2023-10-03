package dataTypes;


public class DatosEstructurados {
	public static void main (String[]args) {
		
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
		 * 
		 * */
		
		String myString = "Hola soy un string";
		System.out.println(myString);
		
		String helloString = new String("Hola soy un segundo string");
		System.out.println(helloString);
		
		/*
		 * Metodo para Strings
		 * 
		 * 
		 * 
		 * */
		
		String texto = "abcAGRCdeCfg";
		
		//--String length. Metodo que permite medir la longitud de una cadena de caracteres
		
		System.out.println("La longitud del texto es "+texto.length());
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		
		//--String:toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el metodo toUpperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el metodo tolowerCase: " + lowerCase);
		
		//--indexOf().Devuelve el indice de la primera aparicion de un texto especifico
		
		String fraseMotivacional = "Una persona exitosa es alguien que o intento una vez mas despues de equivocarse";
		int indexof = fraseMotivacional.indexOf("exitosa");
		System.out.println("La palabra exitosa inicia en el indice: "+indexof);
		
		//--Concatenacion
		
		String firstName = "Marco";
		String lastName = "Alvarado";
		
		String userName = firstName + " " +lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		//-- Métodos de conversión (parseo)
				String presupuesto = "50000";
				System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
				
				int parseao = Integer.parseInt(presupuesto);
				System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());
				
				/*Arrays. Conocidos como arreglos 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * */
				
				
				
				
	}

}
