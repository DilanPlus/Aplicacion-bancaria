
package Clases;

import java.io.*;

public class ManejosArchivos {
    
    Boolean a=false;
    String a1=null;    
  
    File archivo=new File ("BaseDeDatos\\infoCuentas.txt");
    
    /* Verificar si su ingreso es Correcto*/
    public String verificarIngreso(String usuario,String contra){
            //Se busca si existe ese usuario
         try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    cadena=lectura.readLine();
                    
                    if(cadena.equals(contra)){
                        return a1="Verdadero";
                        
                    }else{
                    return a1="ContraseñaMala";
                    
                    }
                    
                  }                 
                  cadena=lectura.readLine();
                  a1="Falso";
              }              
              //
              lectura.close();
              
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }       
    
        return a1;
    }    
       
    /*Se agregar Usuarios nuevos en este Banco*/
    public boolean agregarDatos(String usuario,String contra, String nombre, String apellido, String depositoCorriente,String depositoAhorro){
          
        //Se busca si existe ese usuario
         try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    a=true;                        
                    break;
                  } 
                
                  cadena=lectura.readLine();
                  a=false;
              }
              //
              lectura.close();

          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }          
        
        
       //Se agg usuario
        if(a){
            return a;         
        }else{            
            Datos u= new Datos();
            
            try {
                FileWriter escribir =new FileWriter(archivo,true);
                // escritura de usuario y contraseña
                escribir.write("===================================\n");
                escribir.write(usuario+"\n");
                escribir.write(contra+"\n");
                //escritura de Nombre y Apellido
                escribir.write(nombre+" "+apellido+"\n");
                //escritura de Datos de Cuenta Corriente
                escribir.write("|Cuenta Corriente|\n");
                escribir.write(u.aleatorioNCuentaCorriente()+"\n");
                escribir.write(depositoCorriente+"\n");                        
                //escritura de Datos de Cuenta Ahorro
                escribir.write("|Cuenta Ahorro|\n");
                escribir.write(u.aleatorioNCuentaAhorro()+"\n");
                escribir.write(depositoAhorro+"\n");
                //escritura de Datos de Cuenta Credito
                escribir.write("|Cuenta Credito|\n");
                escribir.write(u.aleatorioNCuentaCredito()+"\n");
                escribir.write("200"+"\n");
            
                escribir.close();
                
            }catch(FileNotFoundException ex){
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
               ex.printStackTrace(System.out);
            }            
            return a;
        }   
        
        
    }
    
    /* Obtener el nombre completo de su usuario*/    
    public String obtenerNombreUsuario(String usuario){
        String nombre = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    cadena=lectura.readLine();
                    cadena=lectura.readLine();
                    nombre=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return nombre;
    }
    
    /* Obtener el Numero cuenta Corriente de su usuario*/   
    public String obtenerNumCorrienteUsuario(String usuario){
        String numCorriente = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=4;i++){
                        cadena=lectura.readLine();
                    }
                    numCorriente=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return numCorriente;
    }  
    
    
    /* Obtener el saldo cuenta Corriente de su usuario*/   
    public String obtenerSaldoCorrienteUsuario(String usuario){
        String saldoCorriente = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=5;i++){
                        cadena=lectura.readLine();
                    }
                    saldoCorriente=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return saldoCorriente;
    }
    
    /* Obtener el Numero cuenta ahorro de su usuario*/   
    public String obtenerNumAhorroUsuario(String usuario){
        String numAhorro = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=7;i++){
                        cadena=lectura.readLine();
                    }
                    numAhorro=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return numAhorro;
    }
    
    /* Obtener el saldo cuenta Ahorro de su usuario*/   
    public String obtenerSaldoAhorroUsuario(String usuario){
        String saldoAhorro = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=8;i++){
                        cadena=lectura.readLine();
                    }
                    saldoAhorro=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return saldoAhorro;
    }
    
    /* Obtener el Numero cuenta Credito de su usuario*/   
    public String obtenerNumCreditoUsuario(String usuario){
        String numCredito = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=10;i++){
                        cadena=lectura.readLine();
                    }
                    numCredito=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return numCredito;
    }
    
    /* Obtener el saldo cuenta Ahorro de su usuario*/   
    public String obtenerSaldoCreditoUsuario(String usuario){
        String saldoCredito = null;
        try {
              BufferedReader lectura =new BufferedReader(new FileReader(archivo));
              String cadena = null;
              cadena=lectura.readLine();
              //
              while(cadena!=null){
                  if(cadena.equalsIgnoreCase(usuario)){
                    for(int i=1;i<=11;i++){
                        cadena=lectura.readLine();
                    }
                    saldoCredito=cadena;
                    break;
                    }
                  cadena=lectura.readLine();
              }              
              //
              lectura.close();
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
          } catch (IOException ex) {
              ex.printStackTrace(System.out);
          }        
        return saldoCredito;
    }  
    
    
    
}
