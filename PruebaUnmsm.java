import javax.swing.JOptionPane;
public class PruebaUnmsm{
	public static void main(String args[]){
		Unmsm facultad=new Unmsm();
		String nombreFacu=JOptionPane.showInputDialog("Ingrese el nombre de su facultad: ");
		facultad.establecerFacultad(nombreFacu);
		facultad.obtenerFacultad();
		facultad.verFacultad(nombreFacu);
		String c=JOptionPane.showInputDialog("Ingrese el ciclo al cual pertenece: ");
		int ciclo;
		ciclo=Integer.parseInt(c);
		facultad.establecerCiclo(ciclo);
		facultad.obtenerCiclo();
		facultad.mostrarMensajeCurso(ciclo);
	}
}