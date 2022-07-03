
package Clases;

public  class Datos {
    private String nombreUsuario;
    private String apellidoUsuario;
    private int nCuentaCorriente;
    private int nCuentaAhorro;
    private int nCuentaCredito;
    private float saldoCorriente;
    private float saldoAhorro;
    private float saldoCredito;
    
    /* generación de saldo*/
    public void aleatorioSaldo(){
        this.saldoCorriente= (float)Math.round((300 + (float)(Math.random()*500))*100d)/100;
        this.saldoAhorro   = (float)Math.round((500 + (float)(Math.random()*1000))*100d)/100;
        this.saldoCredito  = (float)Math.round((1000 + (float)(Math.random()*2000))*100d)/100; 
    }
    
    /* generacion de numeros de cuenta */
    public void aleatorioNCuenta(){        
        this.nCuentaCorriente= 1234567899 + (int)(Math.random()*456789789);
        this.nCuentaAhorro= 1531567899 + (int)(Math.random()*456789789);
        this.nCuentaCredito= 1631567899 + (int)(Math.random()*456789789);
    }
    /* generar nombre y apellido aleatorio de usuario */
    
    public void aleatorioNombresYApellidos(){
       String[] nombresList={"Pepe","Juan","Camilo","Dilan","Elizabeth","Carlos","Luis","María","Cristofer","Auron"};
       String[] apellidosList={"Andrade","Cevallos","Yaqui","Monserati","Rumak","Colon","Pay","Perez","Quiñonez","Urbina"};
       this.nombreUsuario= nombresList[0+(int)(Math.random()*9)];
       this.apellidoUsuario= apellidosList[0+(int)(Math.random()*9)];
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
    public float getSaldoCorriente() {
        return saldoCorriente;
    }
    public float getSaldoAhorro() {
        return saldoAhorro;
    }
    public float getSaldoCredito() {
        return saldoCredito;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
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

    public void setSaldoCorriente(float saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public void setSaldoAhorro(float saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    public void setSaldoCredito(float saldoCredito) {
        this.saldoCredito = saldoCredito;
    }
    
}
