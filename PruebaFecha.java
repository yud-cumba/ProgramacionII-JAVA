//Preguta 3.15
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
 class PruebaFecha{
	public static void main(String args[]){
		Fecha fechaActual= new Fecha(19,9,2016);
		fechaActual.mostrarFecha();
		String d= JOptionPane.showInputDialog("Ingrese el dia: ");
		String m=JOptionPane.showInputDialog("Ingrese el mes:");
		String a=JOptionPane.showInputDialog("Ingrese el a�o:");
		int mes,dia,a�o;
		mes=Integer.parseInt(m);
		dia=Integer.parseInt(d);
		a�o=Integer.parseInt(a);
		fechaActual.establecerDia(dia);
		fechaActual.establecerMes(mes);
		fechaActual.establecerA�o(a�o);
		fechaActual.mostrarFecha();
		
		}
}