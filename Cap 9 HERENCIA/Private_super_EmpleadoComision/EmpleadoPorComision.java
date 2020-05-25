public class EmpleadoPorComision extends Object{ //Object es del paquete java.lang
//La clase Object se usa de forma implicita por eso no es necesario escribir

/*USO DE PROTECTED
protected String primerNombre;
protected String apellidoPaterno;
protected String numeroSeguroSocial;
protected double ventasBrutas;
protected double tarifaComision;*/

private String primerNombre;
private String apellidoPaterno;
private String numeroSeguroSocial;
private double ventasBrutas;
private double tarifaComision;

		
		//CONSTRUTOR
		public EmpleadoPorComision(String nombre, String apellido, String numero, double ventas, double tarifa)
		{
			primerNombre = nombre;
			apellidoPaterno = apellido;
			numeroSeguroSocial = numero;
			establecerVentasBrutas(ventas);
			establecerTarifaComision(tarifa);
		}
		
		//METODOS
		//1
		public void establecerNombre(String nombre)
		{
			primerNombre=nombre;
		}
		public String obtenerNombre()
		{
			return primerNombre;
		}
		//2
		public void establecerApellido(String apellido)
		{
			apellidoPaterno=apellido;
		}
		public String obtenerApellido()
		{
			return apellidoPaterno;
		}
		//3
		public void establecerNumeroSeguro(String numero) 
		{
			numeroSeguroSocial=numero;
		}
		public String obtenerNumeroSeguro()
		{
			return numeroSeguroSocial;
		}
		//4
		public void establecerVentasBrutas(double ventas)
		{
			ventasBrutas=(ventas<0.0)? 0.0:ventas;
		}
		public double obtenerVentasBrutas()
		{
			return ventasBrutas;
		}
		//5
			public void establecerTarifaComision(double tarifa)
		{
		  tarifaComision=(tarifa<0.0)? 0.0:tarifa;
		}
		public double obtenerTarifaComision()
		{
			return tarifaComision;
		}
		
		/*USO DE PROTECTED
		 public double ingresos()	{
			return tarifaComision*ventasBrutas;
		}
		 public String toString()	{
			return String.format("%s: %s %s\n%s:%s\n%s %,.2f\n","Empleado por comisión",primerNombre,apellidoPaterno,"Numero seguro social",numeroSeguroSocial,"Tarifa por comision",tarifaComision);
		}*/
		public double ingresos()	{
			return obtenerTarifaComision()*obtenerVentasBrutas();
		}
		 public String toString()	{
			return String.format("%s: %s %s\n%s:%s\n%s %,.2f\n","Empleado por comisión",obtenerNombre(),obtenerApellido(),"Numero seguro social",obtenerNumeroSeguro(),"Tarifa por comision",obtenerTarifaComision());
		}
		
		
		/*PRUEBA DE EMPLEADO POR COMISION
		public static void main (String args[])
		{ 
			EmpleadoPorComision empleado = new EmpleadoPorComision("Jefferson","Farfan","333.333",5000,0.1);
				
				System.out.println("Informacion del empleado obtenida por los metodos establecer: ");
				System.out.printf("%s %s\n","El primer nombre es ", empleado.obtenerNombre());
				System.out.printf("%s %s\n","El primer apellido es ", empleado.obtenerApellido());
				System.out.printf("%s %s\n","El numero de cuenta es ", empleado.obtenerNumeroSeguro());
				System.out.printf("%s %.2f\n","Las ventas brutas son ",empleado.obtenerVentasBrutas());
				System.out.printf("%s %.2f\n","La tarifa por comision es ",empleado.obtenerTarifaComision());
				
				empleado.establecerVentasBrutas(555);
				empleado.establecerTarifaComision(0.3);
				
				System.out.printf("\n%s:\n \n%s\n","Informacion actualizada del empleado, obtenida mediante metodo toString",empleado); //empleado.toString()
		}*/
}