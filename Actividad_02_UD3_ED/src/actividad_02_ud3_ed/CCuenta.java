/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * Clase cuenta
 * @author mcanmor0312
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * Constructor de la clase cuenta
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta
    * @param sal Numero del saldo
    * @param tipo Tipo de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Constructor de la clase asignar nombre
   * @param nom  nombre que se asigna
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
   * String que te devuelve el nombre
   * @return
   */
    public String obtenerNombre()
    {
        return nombre;
    }
    

     /**
   * Double que te devuelve un saldo
   * @return
   */
     public double estado ()
    {
        return saldo;
    }

    /**
   * Constructor de la clase ingresar
   * @param cantidad  cantidad que se ingresa
   * @exception Exception para cuando se ingresa una cantidad negativa
   */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
   * Constructor de la clase retirar
   * @param cantidad  cantidad que se retira
   * @exception Exception para cuando se retira una cantidad negativa
   */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
     /**
   * String que te devuelve una cuenta
   * @return
   */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  
     /**
   * Constructor que selecciona una cuenta
   * @param cuenta que se recibe
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

   /**
   * Constructor que selecciona un saldo
   * @param saldo que se recibe
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Double que devuelve el tipo de interés
   * @return 
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

   /**
   * Void que selecciona un tipo de interés
   * @param tipoInterés que se recibe
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
