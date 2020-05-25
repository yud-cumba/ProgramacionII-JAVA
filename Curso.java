import javax.swing.JOptionPane;
public class Curso{
	private String nombreCurso;
	public void establecerCurso(String c){
		nombreCurso=c;
	}
	public String obtenerCurso(){
		return nombreCurso;
	}
	public void mostrarMensaje(String nombreCurso){
		JOptionPane.showMessageDialog(null,"Su curso es: "+nombreCurso );
	}
}