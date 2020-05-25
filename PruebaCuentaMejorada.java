//Preguta 3.12
//YUDITD ARACELI CUMBA TINIPUCLLA
import javax.swing.JOptionPane;
public class PruebaCuentaMejorada{
 public static void main (String[] args) {
   CuentaMejorada cuenta1= new CuentaMejorada(50.00);
   System.out.printf("Saldo de cuenta1: %.2f \n ",cuenta1.obtenerSaldo());
   
   String m=JOptionPane.showInputDialog("Escriba el monto para depositar en la cuenta1:" );
   double montoDeposito;
   montoDeposito=Integer.parseInt(m);
   
   System.out.printf("Sumando %.2f al saldo de cuenta1\n",montoDeposito);
   cuenta1.abonar(montoDeposito);
   
   System.out.printf("\n Saldo de cuenta1 :%.2f ",cuenta1.obtenerSaldo());
   
   
   //*************************//
   String r=JOptionPane.showInputDialog("Escriba el monto para retirar de la cuenta1: ");
   double retiro;
   montoDeposito=Integer.parseInt(r);

   System.out.printf("\nRestando %.2f al saldo de cuenta1\n",montoDeposito);
   cuenta1.cargar(montoDeposito);
   
   System.out.printf("\n Saldo de cuenta1 :%.2f\n ",cuenta1.obtenerSaldo());
   
   
   }
}