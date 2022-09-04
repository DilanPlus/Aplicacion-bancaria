package Clases;

public  class Datos {
   
    private int nCuentaCorriente;
    private int nCuentaAhorro;
    private int nCuentaCredito;
    private int valoragua;
    private int valorluz;
    
  
    /* generacion de numeros de cuenta Corriente*/
    public String aleatorioNCuentaCorriente(){   
        String nCuenta;
        nCuenta= String.valueOf(1234567899 + (int)(Math.random()*456789789));
        return nCuenta;
        
    }
    /* generacion de numeros de cuenta Ahorro*/
    public String aleatorioNCuentaAhorro(){   
        String nCuenta;
        nCuenta= String.valueOf(1531567899 + (int)(Math.random()*456789789));
         return nCuenta;
    }
    /* generacion de numeros de cuenta Credito*/
    public String aleatorioNCuentaCredito(){   
      String nCuenta;
      nCuenta= String.valueOf(1631567899 + (int)(Math.random()*456789789));
      return nCuenta;
    }
   
    
    public void aleatorioServicios(){
       this.valoragua = (int)(20*Math.random())+1;
       this.valorluz = (int)(20*Math.random())+1;
    }
    
    /* GET*/
    public int getnCuentaCorriente() {
        return nCuentaCorriente;
    }
    public int getnCuentaAhorro() {
        return nCuentaAhorro;
    }
    public int getnCuentaCredito() {
        return nCuentaCredito;
    }
   

    

    public float getValoragua() {
        return valoragua;
    }

    public float getValorluz() {
        return valorluz;
    }
    

    /* SET*/
    public void setnCuentaCorriente(int nCuentaCorriente) {
        this.nCuentaCorriente = nCuentaCorriente;
    }

    public void setnCuentaAhorro(int nCuentaAhorro) {
        this.nCuentaAhorro = nCuentaAhorro;
    }

    public void setnCuentaCredito(int nCuentaCredito) {
        this.nCuentaCredito = nCuentaCredito;
    }

    public void setValoragua(int valoragua) {
        this.valoragua = valoragua;
    }

    public void setValorluz(int valorluz) {
        this.valorluz = valorluz;
    }

    
}
