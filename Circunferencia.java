//AUTOR:YUDITD ARACELI CUMBA TINIPUCLLA 15140224
//PREGUNTA 2.28
import java.util.Scanner;
public class Circunferencia{
public static void main(String args[]){
	Scanner entrada= new Scanner(System.in);
	float  r;
	System.out.printf("\nBIENVENIDOS AL PROGRAMA\n~~~~~~~~~~~~~~~~~~~~~~~\n");
	System.out.print("Escriba el radio de la circunferencia: ");
	r=entrada.nextInt();
	System.out.printf("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
	System.out.printf("El diametro de la crcunferencia es: %f\n",2*r );
	System.out.printf("El perímetro de la circunferencia es: %f\n", 2*Math.PI*r);
	System.out.printf("El area de la circunferencia es:%f\n",Math.PI*Math.pow(r,2));
	
		}
}