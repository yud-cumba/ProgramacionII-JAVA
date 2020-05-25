//Preguta 3.15
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
 class PruebaFecha{
	public static void main(String args[]){
		Fecha fechaActual= new Fecha(19,9,2016);
		fechaActual.mostrarFecha();
		String d= JOptionPane.showInputDialog("Ingrese el dia: ");
		String m=JOptionPane.showInputDialog("Ingrese el mes:");
		String a=JOptionPane.showInputDialog("Ingrese el año:");
		int mes,dia,año;
		mes=Integer.parseInt(m);
		dia=Integer.parseInt(d);
		año=Integer.parseInt(a);
		fechaActual.establecerDia(dia);
		fechaActual.establecerMes(mes);
		fechaActual.establecerAño(año);
		fechaActual.mostrarFecha();
		
		}
}