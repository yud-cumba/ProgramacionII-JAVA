//Preguta 3.15
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
public class Fecha{
	private int mes;
	private int dia;
	private int a�o;
    //Constructor
    public Fecha(int d,int m, int a){
    dia=d;
    mes=m;
    a�o=a;
    }
    //metodos
    public void establecerDia(int d){
    	dia=d;
    }
    public void establecerMes(int m){
    	mes=m;
    }
    public void establecerA�o(int a){
    	a�o=a;
    }
    public int obtenerDia(){
    	return dia;
    }
    public int obtenerMes(){
    	return mes;
    }
    public int obtenerA�o(){
    	return a�o;
    }
    
    public void mostrarFecha(){
    	JOptionPane.showMessageDialog(null,+obtenerDia()+"/"+obtenerMes()+"/"+obtenerA�o(),"LA FECHA ACTUAL",JOptionPane.PLAIN_MESSAGE);
    }
}