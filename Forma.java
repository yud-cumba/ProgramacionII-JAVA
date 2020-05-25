import javax.swing.JOptionPane;
public class Forma{//Clase
		private String nombreForma;//Variable de instancia
		
		public Forma(String n ){//constructor
			nombreForma=n;
		}
		public void establecerForma(String n){//metodo
			nombreForma=n;
		}
		public String obtenerForma(){//metodo
			return nombreForma;
		}
		public void mostrarForma(String f){//metodo
			JOptionPane.showMessageDialog(null,"Su forma es: "+f);
		}
}