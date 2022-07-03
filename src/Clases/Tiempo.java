/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author DilanPlus
 */
public class Tiempo {
    Calendar fecha = new GregorianCalendar();
    
    String año = Integer.toString(fecha.get(Calendar.YEAR));
    String mes= Integer.toString(fecha.get(Calendar.MONTH));
    String dia= Integer.toString(fecha.get(Calendar.DATE)-1);
    public String fechaCompleta = dia+"/"+mes+"/"+año;
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    public String horaCompleta= hora+":"+minuto;
}
