public class For{
	//Creamos las variables de instancia:
	private String nombre;
	private String apellido;
	private double salarioMensual;
	
	//Creamos los constructores
	public For(String n, String ap ,double sm ){
		nombre=n;
		apellido=ap;
		if(sm>0.0)
		salarioMensual=sm;
	}
	//Creamos los métodos establecer
	public void establecerNombre(String n){
		nombre=n;
	}
	public void establecerApellido(String ap){
		apellido=ap;
	}
	public void establecerSalarioMensual(double sm){
		if(sm>0.0)
		  salarioMensual=sm;
		else
		  salarioMensual=0.0;	
	}
	
	//Creamos los métodos obtener
	public String obtenerNombre(){
		return nombre;
	}
	public String obtenerApellido(){
		return apellido;
	}
	public double obtenerSalarioMensual(){
		return salarioMensual;
	}
  
	
}