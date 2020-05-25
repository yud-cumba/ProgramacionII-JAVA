public class EmpleadoBasePorComision extends EmpleadoPorComision{
	private double salarioBase;
	//CONSTRUCTOR
	public EmpleadoBasePorComision(String nombre, String apellido, String numero, double ventas,double tarifa,double salario){
		super(nombre,apellido,numero,ventas,tarifa);
		establecerSalarioBase(salario);
	}
	public void establecerSalarioBase(double salario){
		salarioBase=(salario<0.0)? 0.0:salario;
	}
	public double obtenerSalarioBase(){
		return salarioBase;
	}
	/*USO DE PROTECTED
	public double ingresos(){
		return salarioBase+(ventasBrutas*tarifaComision);}
	    public String toString()
		{
			return String.format("%s: %s %s\n%s:%s\n%s %,.2f\n %s: %,.2f\n","Empleado por comisión",primerNombre,apellidoPaterno,"Numero seguro social",numeroSeguroSocial,"Tarifa por comision",tarifaComision,"Salario Base",salarioBase);
		}*/
		
		/*public double ingresos()	{
			return obtenerSalarioBase()+(obtenerTarifaComision()*obtenerVentasBrutas());
		}*/
		public double ingresos()	{
			return obtenerSalarioBase()+super.ingresos();
		}
		
		 /*public String toString()	{
			return String.format("%s: %s %s\n%s:%s\n%s %,.2f\n%s %,.2f\n","Empleado por comisión",super.obtenerNombre(),super.obtenerApellido(),"Numero seguro social",super.obtenerNumeroSeguro(),"Tarifa por comision",super.obtenerTarifaComision(),"Salario Base",obtenerSalarioBase());
		}*/
			public String toString()	{
			return String.format("%s%s %,.2f\n",super.toString(),"Salario Base",obtenerSalarioBase());
		}
		
		//PRUEBA EMPLEADO BASE POR COMISION
		public static void main (String args[])
		{ 
			EmpleadoBasePorComision empleado = new EmpleadoBasePorComision("Jefferson","Farfan","333.333",5000,0.1,300.00);
				
				System.out.println("Informacion del empleado obtenida por los metodos establecer: ");
				System.out.printf("%s %s\n","El primer nombre es ", empleado.obtenerNombre());
				System.out.printf("%s %s\n","El primer apellido es ", empleado.obtenerApellido());
				System.out.printf("%s %s\n","El numero de cuenta es ", empleado.obtenerNumeroSeguro());
				System.out.printf("%s %.2f\n","Las ventas brutas son ",empleado.obtenerVentasBrutas());
				System.out.printf("%s %.2f\n","La tarifa por comision es ",empleado.obtenerTarifaComision());
				System.out.printf("%s %.2f\n","El sueldo base es ",empleado.obtenerSalarioBase());
				empleado.establecerVentasBrutas(555);
				empleado.establecerTarifaComision(0.3);
				
				System.out.printf("\n%s:\n \n%s\n","Informacion actualizada del empleado, obtenida mediante metodo toString",empleado); //empleado.toString()
		}
}