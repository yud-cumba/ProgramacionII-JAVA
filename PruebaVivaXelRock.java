import javax.swing.JOptionPane;
public class PruebaVivaXelRock{
	public static void main (String args[]){
		VivaXelRock yud =new VivaXelRock(75,100);
		
		System.out.printf("Hay dos precios, escoge uno:\n1)Explanada\n2)Estadio\n");
		String p=JOptionPane.showInputDialog("Ingrese su opción");
		int opcion;
		opcion=Integer.parseInt(p);
		yud.verPrecio(opcion);
		System.out.printf("\nDESEA COMPRAR UNA ENTRADA\n1)Si\n2)No");
		String p1=JOptionPane.showInputDialog("Ingrese su opción");
		int opcion1;
		opcion1=Integer.parseInt(p1);
		yud.decidirComprar(opcion1);
		System.out.printf("\n\nEscoge uno:\n1)Explanada\n2)Estadio\n");
		String p2=JOptionPane.showInputDialog("Ingrese su opción");
		int opcion2;
		opcion2=Integer.parseInt(p2);
		yud.comprarEntradas(opcion2);
		
		System.out.printf("\n\nDESEA LLEVAR INVITADOS :\n1)Si\n2)No\n");
		String p3=JOptionPane.showInputDialog("Ingrese su opción");
		int opcion3;
		opcion3=Integer.parseInt(p3);
		yud.llevarInvitados(opcion3);
		
		String N=JOptionPane.showInputDialog("Ingrese su NUMERO DE INVITADOS");
		int numero;
		numero=Integer.parseInt(N);
		
		Invitados Yud[]=new Invitados[numero];
		String n="";
		
    for(int i=0;i<Yud.length;i++){
    	n=JOptionPane.showInputDialog("Ingrese su invitado n°"
    		+i);
    	Yud[i]=new Invitados(n);
	}
	 System.out.println("\nSus invitados son:\n");
	for(int i=0;i<Yud.length;i++){
     System.out.println(i+") "+Yud[i].obtenerInvitados()+"\n");
	}
	
} 
}
