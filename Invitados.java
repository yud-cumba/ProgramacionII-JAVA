public class Invitados{
	private String nombre;
	private int numeroInv;
	public Invitados(String n){
		nombre=n;	
	  
	}
	public void establecerInvitados(String n){
			nombre=n;
	}
	public String obtenerInvitados(){
		return nombre;
	}
} 