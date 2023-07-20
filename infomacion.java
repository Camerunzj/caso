
package compañia;
import javax.swing.JOptionPane;


public class infomacion {
    public String nombre;
    public String cedula;
    public String numerodefactura;
    public String monto;
    public String mes;
    public String año;
    public String estado;
    public int plata; 
    
    public String getNombre() {
        return JOptionPane.showInputDialog("Digite su nombre");
    }

    public String getCedula() {
        return JOptionPane.showInputDialog("Digite su cedula");
    }

    public String getNumerodefactura() {
        
        return JOptionPane.showInputDialog("Digite el numero de factura");
    }

    public String getMonto() {
        return JOptionPane.showInputDialog("Digite el monto");
    }

    public String getMes() {
        return JOptionPane.showInputDialog("Digite el mes de la fatura");
    }

    public String getAño() {
        return JOptionPane.showInputDialog("Digite el año de factura");
    }

    public String getEstado() {
        return JOptionPane.showInputDialog("Estado de la factura.Paga o no paga");
    }
    
}
