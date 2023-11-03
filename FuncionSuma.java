import java.util.Scanner;


/*<p> Programa suma, para calcular la suma de dos valores introduidos por teclado
 * @version v1.0 
 * @author Miquel
 * 	@see Para más información ver <a href="google.com">Google</a>
 */

public class FuncionSuma {
	
	/*
	 * <p>Variable para guardar el primer sumando</p>
	 */
	
	private static int primerSumando;
	
	/*
	 * <p>Variable para guardar el segundo sumando</p>
	 */
	
	private static int segundoSumando; 
	
	/*
	 * <p>Funcion principal del programa</p>
	 * <p>args - El parámetro habitual de la función main</p> 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/*
	 * <p>Función que realiza la suma de los dos operandos</p>
	 * <p>sumando1 - Primer sumando de la operación suma</p>
	 * <p>sumando2 - Segundo sumando de la operación suma</p>
	 * <p>Devuelve el resultado de sumar los dos sumandos</p>
	 */
	
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
