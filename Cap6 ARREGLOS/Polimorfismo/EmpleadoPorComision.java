public class EmpleadoPorComision extends Empleado{
	private double ventas, tarifaComision;
		//CONSTRUCCION
		public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa)
		{
			super(nombre,apellido,nss);
			establecerVentas(ventas);
			establecerTarifa(tarifa);
		}
		
		//METODOS
		public void establecerVentas(double ventas)
		{
			if(ventas>0.0)
				this.ventas=ventas;
			else
				throw new IllegalArgumentException("La ventas deben ser positivas");
			}
			
		public double obtenerVentas(){
			return ventas;
		}
		///////////////////////////////
			public void establecerTarifa(double tarifa)
		{
			if(tarifa>0.0 && tarifa<1.0)
				tarifaComision=tarifa;
			else
				throw new IllegalArgumentException("La tarifa debe ser mayor a 0 y menor que 1");
				
		}
		public double obtenerTarifa()
		{
			return tarifaComision;
		}
		@Override
		//Ingreso
		public double ingresos()
		{
			return obtenerTarifa()*obtenerVentas();
		}
		
		@Override
		//ToString
		public String toString()
		{
			return String.format("%s: %s\n%s: %.2f\n%s: %.2f","Empleado por comision", super.toString(),"ventas brutas",ventas,"Tarifa por comision",tarifaComision);
		}
		
		
}