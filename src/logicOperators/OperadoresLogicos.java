package logicOperators;

public class OperadoresLogicos {
	public static void main(String[]args) {
		
		/*
		 * Operadores lógicos.
		 * AND (&&)
		 * OR (||)
		 * NOT (!)
		 */
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		boolean comparacionUno = numeroUno == numeroDos;
		System.out.println(comparacionUno);//false
		
		boolean comparacionDos = (numeroUno < numeroDos) && (numeroUno > numeroDos);
		System.out.println(comparacionDos);//false
		
		boolean comparacionTres = (numeroUno < numeroDos) || (numeroUno > numeroDos);
		System.out.println(comparacionTres);//true
		
		boolean comparacionCuatro = false;
		System.out.println(!comparacionCuatro);//true
		
	}

}
