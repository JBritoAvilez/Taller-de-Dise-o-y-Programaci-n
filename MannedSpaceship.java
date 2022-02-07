/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import javax.swing.JOptionPane;

/**
 *Se declara la clase NaveTripulada, indicamos que es una calse que hereda de la 
 * clase NavesEspaciales y implimenta la interfaz vuelo 
 * @author jonat
 */
public class MannedSpaceship extends  Spaceships implements Flight{
 /**
 * Se declaran los atributos o caracteristicas propias de la clase NavesLanzadora
 */
    public float CapsuleHeight,RocketHeight;
    private int CrewMember;
    
    /**
     * Se implementa el constructor de la calse NavesLanzadora y llamamos el super
     * de la clase NaveEspaciales
     */
    
    public MannedSpaceship(String Name, float Height, float Mass,float CapsuleHeight,float RocketHeight,int CrewMember) {
        super(Name, Height, Mass);
        this.CapsuleHeight= Height;
        this.RocketHeight= RocketHeight;
        this.CrewMember=CrewMember;

    }
    public MannedSpaceship(){
        super();
        CapsuleHeight=0;
        RocketHeight=0;
        CrewMember=0;
    }
    
 /**
 * Implementacion de los metodos modificadores para los atribtos de la clase
 * @return 
 */  
    
    public void setCapsuleHeight(float CapsuleHeight) {
        this.CapsuleHeight = CapsuleHeight;
    }
    
    public void setRocketHeight(float RocketHeight) {
        this.RocketHeight = RocketHeight;
    }
    
    public void setCrewMember(int CrewMember) {
        this.CrewMember = CrewMember;
    }
    
 /**
 * Implementacion de los metodos selectores para obtener el valor de los atributos
 * @return 
 */  
    
    public float getCapsuleHeight() {
        return CapsuleHeight;
    }

    public float getRocketHeight() {
        return RocketHeight;
    }
    
    public int getCrewMember() {
        return CrewMember;
    }

    
    
    
      /**
     * Se sobre escribe en la clase NaveTripulada los metos abstracto de Despegar() y
     * VelocidadOrbital()
     */

  
   
   
    
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

    @Override
    public void Takeoff() {
                this.AccelerationTakeoff = this.AccelerationTakeoff;
        if(AccelerationTakeoff >= 11.19){
           JOptionPane.showInputDialog("su velocidad de despegue es de: "+AccelerationTakeoff+"k/m");
        }
    }
    
}
