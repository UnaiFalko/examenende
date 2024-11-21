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
       
        System.out.print ("Operando 1: ");
        operandos [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        operandos [1] = teclado.nextInt();
           
        System.out.print ("Operaciones [+, -, *, /, %]: ");
        operacion = teclado.next();
        while (!((operacion.equalsIgnoreCase("+")) || (operacion.equalsIgnoreCase("-")) ||
                    (operacion.equalsIgnoreCase("*")) || (operacion.equalsIgnoreCase("/")) ||
                    (operacion.equalsIgnoreCase("%"))
                    ))
            	{
            	 System.out.print ("Operaciones [+, -, *, /, %]: ");
            	  operacion = teclado.next();
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
}