//AUTOR:YUDITD ARACELI CUMBA TINIPUCLLA 15140224
//PREGUNTA 2.32
import javax.swing.JOptionPane;
public class Contador {
	public static void main (String args [])
	{
		String num1, num2, num3, num4, num5;
		
		num1=JOptionPane.showInputDialog("Escriba el primer numero:");
		num2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		num3=JOptionPane.showInputDialog("Escriba el tercer numero:");
		num4=JOptionPane.showInputDialog("Escriba el cuarto numero:");
		num5=JOptionPane.showInputDialog("Escriba el quinto numero:");
		
		int a,b,c,d,e;
		
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
		c=Integer.parseInt(num3);
		d=Integer.parseInt(num4);
		e=Integer.parseInt(num5);
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		if ( a > 0)
			positivos = positivos + 1;
			
		if ( a < 0)
			negativos = negativos + 1;
			
		if ( a==0)
			ceros = ceros + 1;
			
		if ( b > 0)
			positivos = positivos + 1;
			
		if ( b < 0)
			negativos = negativos + 1;
			
		if ( b==0)
			ceros = ceros + 1;
			
		if ( c> 0)
			positivos = positivos + 1;
			
		if ( c < 0)
			negativos = negativos + 1;
			
		if ( c==0)
			ceros = ceros + 1;
			
		if ( d > 0)
			positivos = positivos + 1;
			
		if ( d < 0)
			negativos = negativos + 1;
			
		if ( d==0)
			ceros = ceros + 1;
			
		if ( e > 0)
			positivos = positivos + 1;
			
		if ( e < 0)
			negativos = negativos + 1;
	    if ( e==0)
			ceros = ceros + 1;
			//Imprimir mensaje
		JOptionPane.showMessageDialog(null,"La cantidad de numeros positivos es: "+positivos,"POSITIVOS",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"La cantidad de numeros negativos es: "+negativos,"NEGATIVOS",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"La cantidad de ceros introducidos es: "+ceros,"CEROS",JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);	
	}
}
  
