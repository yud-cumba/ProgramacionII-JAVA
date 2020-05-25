//AUTOR:YUDITD ARACELI CUMBA TINIPUCLLA 15140224
//PREGUNTA 2.24
import javax.swing.JOptionPane;
public class Eleccion{
	public static void main(String args[]){
		String num1,num2,num3,num4,num5;
		num1=JOptionPane.showInputDialog("Ingrese el primer numero");
		num2=JOptionPane.showInputDialog("Ingrese el segundo numero:");
		num3=JOptionPane.showInputDialog("Ingrese el tercer numero");
		num4=JOptionPane.showInputDialog("Ingrese el cuarto numero:");
		num5=JOptionPane.showInputDialog("Ingrese el quinto numero:");
		int a,b,c,d,e;
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
		c=Integer.parseInt(num3);
		d=Integer.parseInt(num4);
		e=Integer.parseInt(num5);
		//mayor
		if(a>b && a>c && a>d && a>e){
			JOptionPane.showMessageDialog(null,a+ " es el numero mayor","RESULTADO",JOptionPane.PLAIN_MESSAGE);
		}
		if(b>a && b>c && b>d && b>e){
			JOptionPane.showMessageDialog(null,b+ " es el numero mayor","RESULTADO 1",JOptionPane.PLAIN_MESSAGE);
		}
		if(c>b && c>a && c>d && c>e){
			JOptionPane.showMessageDialog(null,c+ " es el numero mayor","RESULTADO 1",JOptionPane.PLAIN_MESSAGE);
		}
		if(d>b && d>c && d>a && d>e){
			JOptionPane.showMessageDialog(null,d+ " es el numero mayor","RESULTADO 1",JOptionPane.PLAIN_MESSAGE);
		}
		if(e>b && e>c && e>d && e>a){
			JOptionPane.showMessageDialog(null,e+ " es el numero mayor","RESULTADO 1",JOptionPane.PLAIN_MESSAGE);
		}
		//menor
		if(a<b && a<c && a<d && a<e){
			JOptionPane.showMessageDialog(null,a+ " es el numero menor","RESULTADO 2",JOptionPane.PLAIN_MESSAGE);
		}
		if(b<a && b<c && b<d && b<e){
			JOptionPane.showMessageDialog(null,b+ " es el numero menor","RESULTADO 2",JOptionPane.PLAIN_MESSAGE);
		}
		if(c<b && c<a && c<d && c<e){
			JOptionPane.showMessageDialog(null,c+ " es el numero menor","RESULTADO 2",JOptionPane.PLAIN_MESSAGE);
		}
		if(d<b && d<c && d<a && d<e){
			JOptionPane.showMessageDialog(null,d+ " es el numero menor","RESULTADO 2",JOptionPane.PLAIN_MESSAGE);
		}
		if(e<b && e<c && e<d && e<a){
			JOptionPane.showMessageDialog(null,e+ " es el numero menor","RESULTADO 2",JOptionPane.PLAIN_MESSAGE);
		}
	}
}