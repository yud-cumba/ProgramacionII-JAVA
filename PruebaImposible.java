import javax.swing.JOptionPane;
public class PruebaImposible{
	public static  void main (String args[]){
		Imposible angel=new Imposible();
			angel.estadoCorazon();
			angel.quererme();
			angel.estadoCorazon();
			String regalo=JOptionPane.showInputDialog("Ingrese su regalo");
			angel.regalarme(regalo);
			angel.mostrarRegalo();
			int a;
		    String anio=JOptionPane.showInputDialog("Ingrese su duracion");
			a=Integer.parseInt(anio);
			double m;
			String mes=JOptionPane.showInputDialog("Ingrese los meses");
			m=Double.parseDouble(mes);
			angel.duracionAnio(a);
			angel.duracionMeses(m);
			angel.mostrarDuracion();
			angel.terminar();
			angel.estadoCorazon();
	}
}