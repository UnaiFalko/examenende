package principal;
import operaciones.Operaciones;
import java.util.Scanner;

public class UnaiUgaldebere{
	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Operaciones operaciones = new Operaciones();
       
        pedirNumero(operandos);
           
        operacion = pedirOperacion();
      
        realizarOperacion(operacion, operandos, operaciones);    		 
        	
    }
	public static void realizarOperacion(String operacion, int[] operandos, Operaciones operaciones) {
		int resultado;
		while (!((operacion.equalsIgnoreCase("+")) || (operacion.equalsIgnoreCase("-")) ||
                    (operacion.equalsIgnoreCase("*")) || (operacion.equalsIgnoreCase("/")) ||
                    (operacion.equalsIgnoreCase("%"))
                    ))
            	{
            	 operacion = pedirOperacion();
            	}
        
                if (operacion.equalsIgnoreCase("+")){
                    resultado = operaciones.sumar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                } else if (operacion.equalsIgnoreCase("-")){
                    resultado = operaciones.restar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                } else if (operacion.equalsIgnoreCase("*")){
                    resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                } else if (operacion.equalsIgnoreCase("/")){
                    resultado = operaciones.dividir(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                } else if (operacion.equalsIgnoreCase("%")){
                    resultado = operaciones.resto(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                } else {
                    System.out.println ("Operaci�n no v�lida");
                }
	}
	public static String pedirOperacion() {
		String operacion;
		System.out.print ("Operaciones [+, -, *, /, %]: ");
        operacion = teclado.next();
		return operacion;
	}
	public static void pedirNumero(int[] operandos) {
		System.out.print ("Operando 1: ");
        operandos [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        operandos [1] = teclado.nextInt();
	}
}