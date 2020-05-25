//Preguta 3.11
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
public class LibroCalificacionesMejorado{
	private String nombreDelCurso;//Variable de instancia
	
	//a)Nueva variable de instancia para "Nombre del insructor"
	private String nombreDelInstructor;
	
	//c)Constructor mejorado que admite "nombre del curso" y "nombre del instructor"
	public LibroCalificacionesMejorado(String nombre, String instructor){
		nombreDelCurso=nombre;
		nombreDelInstructor=instructor;
	}
//M�todos
    public void establecerNombreDelCurso(String nombre){
		nombreDelCurso=nombre;
	}
	public String obtenerNombreDelCurso(){
		return nombreDelCurso;
	}

//b)M�todos "obtener" y "establecer" para "Nombre del instructor"
     public void establecerNombreDelInstructor(String instructor){
		nombreDelInstructor=instructor;
	}
	public String obtenerNombreDelInstructor(){
		return nombreDelInstructor;
	}
	
	//d)M�todo mejorado de "mostrarMensaje"
		public void mostrarMensaje(){
		JOptionPane.showMessageDialog(null,"Bienvenido al Libro de califcaciones para "+obtenerNombreDelCurso()+ "\n Este curso est� presentado por "+obtenerNombreDelInstructor() );
	}
//Fin de los m�todos
}