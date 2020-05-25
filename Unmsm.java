import javax.swing.JOptionPane;
public class Unmsm{
	private String a;
	private int cicl;
	
	public void establecerFacultad(String f){
		a=f;
	}
	public String obtenerFacultad(){
		return a;
	}
	public void verFacultad(String a){
		JOptionPane.showMessageDialog(null,"Su facultad es: " +a,"NOMBRE DE FACULTAD",JOptionPane.PLAIN_MESSAGE);
	}
	public void establecerCiclo(int c){
		cicl=c;
	}
	public int obtenerCiclo(){
		return cicl;
	}
	public void mostrarMensajeCurso(int cicl){
		JOptionPane.showMessageDialog(null,"Ud está en el ciclo n°: "+cicl);
	}
}