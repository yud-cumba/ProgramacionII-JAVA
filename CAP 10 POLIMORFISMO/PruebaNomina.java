public class PruebaNomina{
	public static void main(String args[]){
		EmpleadoAsalariado empleadoAsalariado= new EmpleadoAsalariado("Emp.","Asalariado","123456",100);
		EmpleadoPorHoras empleadoPorHoras=new EmpleadoPorHoras("Emp.","PorHoras","3456788",50,34);
		EmpleadoPorComision empleadoComision= new EmpleadoPorComision("Emp","Comision","98766554",45,0.7);
		EmpleadoBasePorComision empleadoBaseComision= new EmpleadoBasePorComision("Emp","Comision","98766554",45,0.5,75);
		
		Empleado empleados[]=new Empleado[4];
		empleados[0]=empleadoAsalariado;
		empleados[1]=empleadoPorHoras;
		empleados[2]=empleadoComision;
		empleados[3]=empleadoBaseComision;
		
		System.out.println("Empleado forma polimorfica");
		
		for(Empleado empleadoActual:empleados){
			System.out.println(empleadoActual);
			if(empleadoActual instanceof EmpleadoBasePorComision){
				EmpleadoBasePorComision empleado=(EmpleadoBasePorComision) empleadoActual;
				double salarioBaseAnterior=empleado.obtenerSalarioBase();
				empleado.establecerSalarioBase(1.10*salarioBaseAnterior);
				System.out.printf("Nuevo Salario: $%,.2f",empleado.obtenerSalarioBase());
			}
			System.out.printf("Ingresos: $%,.2f",empleadoActual.ingresos());
		}
		
		for(int i=0;i<empleados.length; i++){
			System.out.printf("El empleado %d es un %s\n",i,empleados[i].getClass().getName());
		}
		
	}
}