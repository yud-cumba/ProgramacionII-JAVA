import javax.swing.JOptionPane;
public class PruebaAlumno{
	public static void main(String args[]){
		Alumno[] a=new Alumno[2];
		String nombre="";
		int matricula=0;
		int grado=0;
		for(int i=0; i<a.length;i++){
	   nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
	   matricula=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu matricula"));
	   grado=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu grado"));
	   a[i]= new Alumno( nombre ,matricula,grado);
		}
		for (int i=0;i<a.length;i++){
		 System.out.println(i+") Su nombre es: "+ a[i].getnombre() +"\n Su matricula: "+  a[i].getmatricula()+"\nSu grado:" +a[i].getgrado());
		}
	}
}
