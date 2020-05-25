//clase abstracta
public abstract class Empleado
{
	private String nombre, apellido, seguro;
	
	public Empleado(String nombre, String apellido, String nss)
	{
		this.nombre = nombre;
		this.apellido=apellido;
		seguro=nss;
	}
	
	public void establecerNombre(String nom)
	{
		nombre=nom;
	}
	public String obtnerNombre()
	{
		return nombre;
	}
	public void establecerApellido(String apell)
	{
		apellido=apell;
	}
	public String obtenerApellido()
	{
		return apellido;
	}
	public void establecerSeguro(String seg)
	{
		seguro=seg;
	}
	public String obtenerSeguro()
	{
		return seguro;
	}
	
	@Override
		public String toString()
		{
			return String.format("%s %s\nnumero de seguro social: %s", obtnerNombre(),obtenerApellido(),obtenerSeguro());
		}
		
		public abstract double ingresos(); //ingresos abstract
}