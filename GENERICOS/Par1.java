public class Par1<A,B>{
	private A a;
	private B b;
	public Par1(A a,B b){
	this.a=a;
	this.b=b;	
	}
	public void mostrarPar(){
		System.out.println("("+a+","+b+")");
	}
	public static void main(String args[]){
		Par1<String,Integer> yud=new Par1("Holi",3);
		yud.mostrarPar();
	}
	}