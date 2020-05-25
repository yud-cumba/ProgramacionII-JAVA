public class Alumno{
	private String nombre;
	private int matricula;
	private int grado;
	
	public Alumno(){
		nombre="";
		matricula=0;
		grado=0;
	}
	public Alumno (String n,int m , int g){
		nombre=n;
		matricula=m;
		grado=g;
	}
	public String getnombre(){
		return nombre;
	}
	public int getmatricula(){
		return matricula;
	}
	public int getgrado(){
		return grado;
	}
}
