public class Yud{
	private String NombreAmiga;
	private int edad;
	public Yud(){
		NombreAmiga="";
		edad=0;
	}
	public Yud(String N ,int e){
		NombreAmiga=N;
		edad=e;
	}
	
	public void establecerNombre(String N){
		NombreAmiga=N;
	}
	public void establecerEdad(int e){
		edad= e;
	}
	public String obtenerNombre(){
		return NombreAmiga;
	}
	public int obtenerEdad(){
		return edad;
	}
}