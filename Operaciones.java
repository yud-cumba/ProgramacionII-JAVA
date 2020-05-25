import java.util.Scanner;
public class Operaciones{
	public static void main (String args[]){
	Scanner entrada= new Scanner(System.in);
	float a,b;
	float suma,resta,producto,cociente;
	System.out.print("Escriba un número: ");
	a=entrada.nextInt();
	System.out.print("Esciba otro número: ");
	b=entrada.nextInt();
	suma=a+b;
	resta=a-b;
	producto=a*b;
	cociente=a/b;
	System.out.printf("\n******************************\n");
	System.out.printf("La suma de los numeros %f:",suma);
	System.out.printf("\n******************************\n");
	System.out.printf("La diferencia de los numeros %f:",resta);
	System.out.printf("\n******************************\n");
	System.out.printf("El producto de los numeros %f:",producto);
	System.out.printf("\n******************************\n");
	System.out.printf("El cociente de los numeros %f:",cociente);
	System.out.printf("\n******************************\n");
		}
}