/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;


/**
 *
 * @author DilanPlus
 */
public class EcEduEpnPrograII2022AAplicacionBancaria {
    
public static int nCuenta;
public static double nSaldo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nCuenta=1+(int)(Math.random()*999999);
        nSaldo=(Math.random()*999999);
        VentanaDetalle abrir = new VentanaDetalle();
        abrir.setVisible(true);
        
        
    }
}
