//Preguta 3.12
//YUDITD ARACELI CUMBA TINIPUCLLA
public class CuentaMejorada{
	private double saldo;
	
	public CuentaMejorada( double SaldoInicial){
		if (SaldoInicial> 0.0)
		saldo=SaldoInicial;
	}
	
	public void abonar(double monto){
		saldo=saldo+monto;
	}
	
	public void cargar(double monto){
		if(saldo>=monto)
		saldo=saldo-monto;
		else
		System.out.println("\nEl monto a cargar excede el saldo de la cuenta");
		
	}
	public double obtenerSaldo(){
		return saldo;
	}
}