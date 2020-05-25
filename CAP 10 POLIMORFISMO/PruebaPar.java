import javax.swing.JOptionPane;
public static void main(String args[]){
	Par <Integer> p=new Par(5,8);
	Par <Integer>p1=new Par("Hola","Mundo");
	
	JOptionPane.showMessageDialog(null,"Antes del cambio:("+p.obtenerA()+","+p.obtenerB()+")\n",+p.obtenerA()+","+p.obtenerB()+")");
	
	p.intercambio(p);
	p1.intercambio(p1);
	
	JOptionPane.showMessageDialog(null,"Despues del cambio:("+p.obtenerA()+","+p.obtenerB()+")\n",+p.obtenerA()+","+p.obtenerB()+")");
}