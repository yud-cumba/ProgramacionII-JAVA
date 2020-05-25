//AUTOR:YUDITD ARACELI CUMBA TINIPUCLLA 15140224
//PREGUNTA 2.16
import javax.swing.JOptionPane;
public class Comparar{
	public static void main (String args[]){
		String num1, num2;
		num1=JOptionPane.showInputDialog("Escriba el primer numero");
		num2=JOptionPane.showInputDialog("Escriba otro numero");
		int a,b;
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
			if(a>b){
			JOptionPane.showMessageDialog(null,a+" es el numero mas grande","RESPUESTA",JOptionPane.PLAIN_MESSAGE);
			}
			if(a<b){
			JOptionPane.showMessageDialog(null,b+" es el numero mas grande","RESPUESTA",JOptionPane.PLAIN_MESSAGE);
			}
			if(a==b){
			JOptionPane.showMessageDialog(null,"Ambos numeros son iguales","RESPUESTA",JOptionPane.PLAIN_MESSAGE);
			}
			
	}
}