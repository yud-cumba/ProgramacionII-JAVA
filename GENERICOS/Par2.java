public class Par2<Y>{
	Y a,b;
	public Par2(Y a, Y b){
		this.a=a;
		this.b=b;
	}
	public Y obtenerA(){
		return a;
	}
	public Y obtenerB(){
		return b;
	}
	public Par2<Y> cambio(Par2<Y> temporal){
		Y y=temporal.a;
		temporal.a=temporal.b;
		temporal.b=y;
		
		return new Par2<Y>(a,b);
	
	}
	public static void main(String args[]){
		Par2<Integer> yud=new Par2("Welcome","Boli");
		System.out.println("Antes del cambio:"+yud.obtenerA()+","+yud.obtenerB());
		yud.cambio(yud);
		System.out.println("Despues del cambio:"+yud.obtenerA()+","+yud.obtenerB());
	}
}