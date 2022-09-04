
package Clases;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ManejosArchivos {
    
    Boolean a=false;
    String a1=null;    
  
    File archivo=new File ("BaseDeDatos\\infoCuentas.txt");
    File auxArchivo =new File("BaseDeDatos\\auxArchivo.txt");
    
    private static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    
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
       
    /*Se AGREGAR USUARIOS NUEVOS en este Banco*/
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
                escribir.write("\n===================================\n");
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
    
    /* Obtener el NOMBRE COMPLETO de su usuario*/    
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
    
    /* Obtener el NUMERO cuenta CORRIENTE de su usuario*/   
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
    
    
    /* Obtener el SALDO cuenta CORRIENTE de su usuario*/   
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
    
    /* Obtener el NUMERO cuenta AHORRO de su usuario*/   
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
    
    /* Obtener el SALDO cuenta AHORRO de su usuario*/   
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
    
    /* Obtener el NUMERO cuenta CREDITO de su usuario*/   
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
    
    /* Obtener el SALDO cuenta CREDITO de su usuario*/   
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
    
    
    public void pagar(String usuario,int tipoCuenta,int valor){
        
         // Se copia contenido en el auxiliar
        try {
            copyFile(archivo,auxArchivo);            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        //borrar contenido del archivo original
        try {
            FileWriter escribir=new FileWriter(archivo);
            escribir.write("");
            escribir.close();                    
        } catch (IOException ex) {
          ex.printStackTrace(System.out);
        }
        
         // se agg contenido linea por linea + mas modificacion + agg linea por linea
        try {
                        
            FileReader lectura= new FileReader(auxArchivo);
            BufferedReader lector=new BufferedReader(lectura);
            
            String x=null;
            x=lector.readLine();
            
            FileWriter escribir=new FileWriter(archivo,true);    
           
             /*Cambio de valor de Corriente*/            
            if(tipoCuenta==0){
                while(x!=null){
                    if(x.equalsIgnoreCase(usuario)){
                        for(int i=1;i<=5;i++){
                        escribir.write(x+"\n");
                        x=lector.readLine();
                        }
                        escribir.write(valor+"\n");
                        x=lector.readLine();
                    }else{
                    escribir.write(x+"\n");
                                    System.out.println(x);                   
                    x=lector.readLine();
                    }                 
                }            
            }
             /*Cambio de valor de Ahorro*/
            if(tipoCuenta==1){
                while(x!=null){
                        if(x.equalsIgnoreCase(usuario)){
                            for(int i=1;i<=8;i++){
                            escribir.write(x+"\n");
                            x=lector.readLine();
                            }
                            escribir.write(valor+"\n");
                            x=lector.readLine();
                        }else{
                            escribir.write(x+"\n");
                            x=lector.readLine();
                        }                 
                 }

            }
             /*Cambio de valor de Credito*/
            if(tipoCuenta==2){
                while(x!=null){
                        if(x.equalsIgnoreCase(usuario)){
                            for(int i=1;i<=11;i++){
                            escribir.write(x+"\n");
                            x=lector.readLine();
                            }
                            escribir.write(valor+"\n");
                            x=lector.readLine();
                        }else{
                            escribir.write(x+"\n");
                            x=lector.readLine();
                        }                 
                 }
            }
            //////////////////////////////////////////
            lector.close();            
            escribir.close();            
            auxArchivo.delete();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
    
}
