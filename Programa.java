public class Programa{
public static void main(String args []){
		try{
			System.out.println("Intentamos ejecutar el bloque de instrucciones");
		    System.out.println("Instruccion 1");
		    int n=Integer.parseInt("M");//error forzado
		    System.out.println("Instruccion 2");
		    System.out.println("Instruccion 3, etc");
		}
		catch (Exception e){
			System.out.println("\nInstrucciones a ejecutar cuando se produce un error" );
			System.out.println("ALERTA\nSe ha producido un error");
		}
		finally{
			System.out.println("\nInstruciones a ejecutar finalmente tanto si se producen errores como si no.");
		}
	}
}