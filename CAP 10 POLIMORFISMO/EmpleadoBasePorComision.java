public class EmpleadoBasePorComision extends EmpleadoPorComision{
	protected double salario;
	
	public EmpleadoBasePorComision(String nombre, String apellido, String nss, double ventas, double tarifa,double salario)
		{
			super(nombre,apellido,nss,ventas,tarifa);
				establecerSalarioBase(salario);
		}
	public void establecerSalarioBase(double salario)
	{
		if(salario>0.0)
			this.salario=salario;
			else
				throw new IllegalArgumentException("Salario debe ser positivo");
	}
	
	public double obtenerSalarioBase()
	{
		return salario;
	}
	@Override
	public double ingresos()
	{
		return obtenerSalarioBase() + super.ingresos();
	}
	@Override
	public String toString()
	{
	
			return String.format("%s %s\n%s: %.2f","Con sueldo base",super.toString(),"Salario base",obtenerSalarioBase());
	}
		
}