/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import javax.swing.JOptionPane;

/**
 *Se declara la clase NaveNoTripulada, indicamos que es una calse que hereda de la 
 * clase NavesEspaciales y implimenta la interfaz vuelo 
 * @author jonat
 */
public class UnmannedSpaceShip extends Spaceships implements Flight{
/**
 * Se declaran los atributos o caracteristicas propias de la clase NaveNoTripulada
 */
    public float Length,Broad;
    public int Engines;

    /**
     * Se implementa el constructor de la calse NavesLanzadora y llamamos el super
     * de la clase NaveEspaciales
     */
    
    public UnmannedSpaceShip(String Name, float Height, float Mass, float Length, float Broad, int Engines) {
        super(Name, Height, Mass);
        this.Length=0;
        this.Broad=0;
        this.Engines=0;
    }
    public UnmannedSpaceShip(){
        super();
        Length = 0;
        Broad = 0;
        Engines = 0;
    }
    
 /**
 * Implementacion de los metodos modificadores para los atribtos de la clase
 * @return 
 */ 

    public void setLength(float Length) {
        this.Length = Length;
    }

    public void setBroad(float Broad) {
        this.Broad = Broad;
    }
    
    public void setEngines(int Engines) {
        this.Engines = Engines;
    }
 
 /**
 * Implementacion de los metodos selectores para obtener el valor de los atributos
 * @return 
 */
    
    public float getLength() {
        return Length;
    }
    
    public float getBroad() {
        return Broad;
    }

    public int getEngines() {
        return Engines;
    }

    /**
     * Se sobre escribe en la clase NaveLanzadora los metos abstracto de Despegar() y
     * VelocidadOrbital()
     */
    @Override
    public void Takeoff() {
        this.AccelerationTakeoff = this.AccelerationTakeoff;
        if(AccelerationTakeoff >= 11.19){
           JOptionPane.showInputDialog("su velocidad de despegue es de: "+AccelerationTakeoff+"k/m");
        }
    }

   public void OrbitalSpeed(){
        int atmosfera;
        for(int orbita = 0; orbita <101;orbita++){
            atmosfera = orbita + 1;
            System.out.println(atmosfera);
         if(atmosfera > 100){
            this.AccelerationTakeoff = (float) 7.8;
            JOptionPane.showInputDialog("has llegado a la orbita y tu velocidad disminuyo hasta: "+AccelerationTakeoff+"k/m");
        }   
        }
    }
}
