import javax.swing.JOptionPane;
public class PruebaCurso{
	public static void main(String args[]){
		Curso materia=new Curso();
		String nombreMateria=JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
		materia.establecerCurso(nombreMateria);
		materia.obtenerCurso();
		materia.mostrarMensaje(nombreMateria);
	}
}