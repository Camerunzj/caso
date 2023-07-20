/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compañia;
import javax.swing.JOptionPane;
/**
 *
 * @author camer
 */
public class Compañia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero = 1;
       int suma = 0;
       float average;
       infomacion check = new infomacion();
       
      /* infomacion check = new infomacion();
        System.out.println("Nombre = " + check.getNombre());                
        System.out.println("Cedula = " + check.getCedula());  
        System.out.println("Numero de factura = " + check.getNumerodefactura());  
        System.out.println("Mes = " + check.getMes()); 
        System.out.println("Year = " + check.getAño());  
        System.out.println("Estado de factura = " + check.getEstado());  
        */
                
                while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la factura (digite un numero negativo para salir)"));
            if ( numero == 0) {
                break;    
                
            }
            suma += numero;
                       
        }
                average = (float) ((suma*0.05)+suma)/6;
             JOptionPane.showMessageDialog(null, "Monto total: "+suma);
             JOptionPane.showMessageDialog(null, "Monto por mes: "+average);
    }
    
}
