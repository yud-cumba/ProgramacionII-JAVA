public class VivaXelRock{
	private int costo1;
	private int costo2;
    private boolean comprarEntrada;
    private boolean deci;
	
	public VivaXelRock(int c1,int c2){
		costo1=c1;
		costo2=c2;
		comprarEntrada=false;
		deci=false;
	}
	public void verPrecio(int opcion){
		if(opcion==1){
		System.out.printf("\nEl precio de la explanada es:%d\n",costo1);
		}
	
		if(opcion==2){
		System.out.printf("\nEl precio del estadio es: %d\n",costo2);
		} 
	
	} 
	public void decidirComprar(int opcion1){
		if(opcion1==1){
		comprarEntrada=true;
		}
		if(opcion1==2){
		comprarEntrada=false;
		System.out.printf("\nxxxxxxxxxxxxxxxxxxxxxxx\n");	
		}
		
	}
	public void comprarEntradas(int opcion2){
		if(comprarEntrada=true){
		   if(opcion2==1)
		System.out.printf("\nFelicidades ud compró entradas para la explanada\n");	
		   
		   if(opcion2==2)
		System.out.printf("\nFelicidades ud compró entradas para el estadio\n");	
		}
	}
	
	public void llevarInvitados(int opcion){
		if(opcion==1)
		deci=true;
	}
}