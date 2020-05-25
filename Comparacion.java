import java.util.Scanner;
public class Comparacion{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		int a,b;
		System.out.print("Escriba un numero entero:");
			a=entrada.nextInt();
		System.out.print("Escriba otro numero entero:");
		b=entrada.nextInt();
		if(a>b){
			System.out.printf("%d es el numero mas grande",a);
			}
			if(b>a){	
				System.out.printf("%d es el numero mas grande",b);
			}
			if(a==b){
			System.out.printf("Estos numeros son iguales");
			}
			System.out.printf("\n\n*Gracias por usar este programa*\n\n");			
	}
}