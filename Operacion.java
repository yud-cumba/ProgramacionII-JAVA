//AUTOR:YUDITD ARACELI CUMBA TINIPUCLLA 15140224
//PREGUNTA 2.15
import javax.swing.JOptionPane;
public class Operacion {
	public static void main (String args [])
	{
		String num1, num2;
		num1=JOptionPane.showInputDialog("Escriba el primer numero:");
		num2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		float a,b, suma, producto, diferencia,cociente;
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
		suma= a+b;
		producto=a*b;
		diferencia=a-b;
		cociente=a/b;
		
		JOptionPane.showMessageDialog(null," suma "+suma,"SUMA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," producto = "+producto,"PRODUCTO",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," diferencia = "+diferencia,"DIFERENCIA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," cociente = "+cociente,"COCIENTE",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);	
	}
}
