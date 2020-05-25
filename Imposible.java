public class Imposible{
	private boolean MeQuiere;
	public String regalo;
	public int aniosJuntos;
	public double meses;
	public Imposible(){
		MeQuiere=false;
	}
	public void quererme(){
		MeQuiere=true;	
		}
	public void estadoCorazon(){
		if(MeQuiere==true)
			System.out.println("Te quiere *3* ");
		else
			System.out.println("No te quiere :c ");
	}
	public void regalarme(String p){
		if(MeQuiere==true)
		regalo=p;
	}

	public void mostrarRegalo(){
		System.out.printf("Tu regalo es %s",regalo);
	}
	public void duracionAnio( int a){
		if(MeQuiere==true)
		aniosJuntos=a;
	}
	public void duracionMeses(double m){
		if(MeQuiere==true)
		meses=m;
	}
	public void mostrarDuracion(){
		System.out.printf("\nLos años juntos son %d años y %.2f meses", aniosJuntos, meses);
	}
	public void terminar(){
			MeQuiere=false;
	}
}