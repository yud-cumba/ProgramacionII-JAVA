//Preguta 3.11
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
public class PruebaLibroCalificacionesMejorado{
	public static void main (String[] args) {
	LibroCalificacionesMejorado libro1=new LibroCalificacionesMejorado("Cálculo 4","Humberto Nuñez");
	libro1.obtenerNombreDelCurso();
	libro1.obtenerNombreDelInstructor();
	libro1.mostrarMensaje();
	
	LibroCalificacionesMejorado libro2=new LibroCalificacionesMejorado("Análisis Real", "Luyo");
	libro2.obtenerNombreDelCurso();
	libro2.obtenerNombreDelInstructor();
	libro2.mostrarMensaje();
	String materia=JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
	String instructor=JOptionPane.showInputDialog("Ingrese el nombre del instructor: ");
	
	libro2.establecerNombreDelCurso(materia);
	libro2.establecerNombreDelInstructor(instructor);
	
	libro2.obtenerNombreDelCurso();
	libro2.obtenerNombreDelInstructor();
	libro2.mostrarMensaje();
	
  }
}