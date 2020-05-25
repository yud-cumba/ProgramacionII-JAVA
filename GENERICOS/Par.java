public class Par<T>
{
	T a,b;
	public Par(T a , T b){
		this.a=a;
		this.b=b;
	}
	public T obtenerA(){
		return a;
	}
	
	public T obtenerB(){
		return b;
	}
	public Par<T> intercambio(Par<T> pobjeto){ 
	T x=pobjeto.a;
	pobjeto.a=pobjeto.b;
	pobjeto.b=x;
	 
	 return new Par<T>(a,b);
	}
}