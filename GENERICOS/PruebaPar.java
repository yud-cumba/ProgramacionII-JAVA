import javax.swing.JOptionPane;
public class PruebaPar{
public static void main(String args[]){
	Par <Integer> p=new Par(1,2);
	Par <Integer> p1=new Par("Hola","Mundo");
	
	JOptionPane.showMessageDialog(null,"Antes del cambio:\n("+p.obtenerA()+","+p.obtenerB()+")\n("+p1.obtenerA()+","+p1.obtenerB()+")");
	
	p.intercambio(p);
	p1.intercambio(p1);
	
	JOptionPane.showMessageDialog(null,"Despues del cambio:\n("+p.obtenerA()+","+p.obtenerB()+")\n("+p1.obtenerA()+","+p1.obtenerB()+")");
}
}