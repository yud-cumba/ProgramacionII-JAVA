import javax.swing.JOptionPane;
public class PruebaYud{
	public static void main(String args[]){
		Yud amigos[]=new Yud[3];
		String n="";
		int e=0;
	
		for(int i=0;i<amigos.length;i++){
			n=JOptionPane.showInputDialog("Ingresa el nombre:");
			e=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
		    amigos[i]=new Yud(n,e);
		}
		for (int i=0; i<amigos.length ; i++){
			System.out.println(i+")Su nombre: "+amigos[i].obtenerNombre()+"\nSu edad: "+amigos[i].obtenerEdad());
		}
	}
}