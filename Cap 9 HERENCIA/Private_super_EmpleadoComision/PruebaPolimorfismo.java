public class PruebaPolimorfismo{
	public static void main(String args[]){
		EmpleadoPorComision empleadoPorComision=new EmpleadoPorComision("Yudith","Cumba","66888",44,449);
		EmpleadoBasePorComision empleadoBasePorComision=new EmpleadoBasePorComision("Raquel","Catri","668h232e8",999,4334,4439);
	System.out.printf("\n%s:\n \n%s\n","Llamada a toString de EmpleadoPorComision con referencia de super clase\n a un objeto de la super clase",empleadoPorComision);
	System.out.printf("\n%s:\n \n%s\n","Llamada a toString de EmpleadoBasePorComision con referencia de subclase\n  a un objeto de la subclase",empleadoBasePorComision);
	///////////////////7
	EmpleadoPorComision empleadoPorComision2 = empleadoBasePorComision;
	System.out.printf("\n%s:\n \n%s\n","Llamada a toString de EmpleadoBasePorComision con referencia de superclase\n  a un objeto de la subclase",empleadoPorComision2);
	
	}
}