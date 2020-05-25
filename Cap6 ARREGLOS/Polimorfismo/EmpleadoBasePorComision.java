public class EmpleadoBasePorComision extends EmpleadoPorComision{
	protected double salario;
	
	public EmpleadoBasePorComision(String nombre, String apellido, String nss, double ventas, double tarifa,double salario)
		{
			super(nombre,apellido,nss,ventas,tarifa);
				establecerSalario(salario);
		}
	public void establecerSalario(double salario)
	{
		if(salario>0.0)
			this.salario=salario;
			else
				throw new IllegalArgumentException("Salario debe ser positivo");
	}
	
	public double obtenerSalario()
	{
		return salario;
	}
	@Override
	public double ingresos()
	{
		return obtenerSalario() + super.ingresos();
	}
	@Override
	public String toString()
	{
			
			return String.format("%s %s\n%s: %.2f","Con sueldo base",super.toString(),"Salario base",obtenerSalario());
	}
	
	
	
	
	//PRUEBA EMPLEADO BASE MAS COMISION
	public static void main (String agrs[])
	{
		EmpleadoBasePorComision empleado = new EmpleadoBasePorComision("Jose","Guerrero","333.555",1000,0.02,330);
		
		System.out.printf("\n%s:\n \n%s\n","Informacion del empleado",empleado);
		
		empleado.establecerSalario(5555);
		
		System.out.printf("\n%s:\n \n%s\n","Informacion del empleado",empleado);
		
	}
	
		
}