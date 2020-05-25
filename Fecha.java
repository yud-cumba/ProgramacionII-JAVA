//Preguta 3.15
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
public class Fecha{
	private int mes;
	private int dia;
	private int año;
    //Constructor
    public Fecha(int d,int m, int a){
    dia=d;
    mes=m;
    año=a;
    }
    //metodos
    public void establecerDia(int d){
    	dia=d;
    }
    public void establecerMes(int m){
    	mes=m;
    }
    public void establecerAño(int a){
    	año=a;
    }
    public int obtenerDia(){
    	return dia;
    }
    public int obtenerMes(){
    	return mes;
    }
    public int obtenerAño(){
    	return año;
    }
    
    public void mostrarFecha(){
    	JOptionPane.showMessageDialog(null,+obtenerDia()+"/"+obtenerMes()+"/"+obtenerAño(),"LA FECHA ACTUAL",JOptionPane.PLAIN_MESSAGE);
    }
}