public class PruebaFor{
	public static void main(String args []){
		For empleado1=new For("Yumari","Cruz",1000.00);
	    For empleado2=new For("Angel","Rivera",1250.00);
		//Capacidades de cada empleado
		System.out.printf("El  empleado 1: %s %s \n Salario mensual: %.2f\n", empleado1.obtenerNombre(),empleado1.obtenerApellido(),empleado1.obtenerSalarioMensual() );
		System.out.printf("El  empleado 2: %s %s \n Salario mensual: %.2f\n", empleado2.obtenerNombre(),empleado2.obtenerApellido(),empleado2.obtenerSalarioMensual() );
	    //Ahora veamos su salario anual
	    System.out.printf("\n*************SALARIO ANUAL****************\n");
	    System.out.printf("Salario anual del empleado 1: %.2f\n",12*empleado1.obtenerSalarioMensual() );
		System.out.printf("Salario anual del empleado 2: %.2f\n",12*empleado2.obtenerSalarioMensual() );
	    //Ahora aumentemos el sueldo un 10% 
	    double saldoAumentado1,saldoAumentado2;
	    saldoAumentado1=empleado1.obtenerSalarioMensual()+(empleado1.obtenerSalarioMensual()*1/10);
	    saldoAumentado2=empleado2.obtenerSalarioMensual()+(empleado2.obtenerSalarioMensual()*1/10);
	    empleado1.establecerSalarioMensual(saldoAumentado1);
	    empleado2.establecerSalarioMensual(saldoAumentado2);
	    System.out.printf("\n*****NUEVO SALARIO ANUAL (10 por ciento mas)*****\n");
	    System.out.printf("Salario anual del empleado 1: %.2f\n",12*empleado1.obtenerSalarioMensual() );
	    System.out.printf("Salario anual del empleado 2: %.2f\n",12*empleado2.obtenerSalarioMensual() );
	}
}