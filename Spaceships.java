/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 * Se declara la clase abstracta NavesEspaciales, por ser una clase abstracta se supone
 * que se podra declarar un metodo abstracto al interior de esta
 * @author jonat
 */
public abstract class Spaceships {
/**
 * Se declaran los atributos o caracteristicas propias de la clase NavesEspaciales
 */
    public String Name;
    public float Height,Mass;
    public float AccelerationTakeoff = (float)11.19;
/**
 * Se implementa el constructor de la calse NavesEspaciales
 * @param Name
 * @param Height
 * @param Mass 
 */
    public Spaceships(String Name, float Height, float Mass) {
        this.Name = Name;
        this.Height = Height;
        this.Mass = Mass;
    }   
    public Spaceships(){
        Name = "";
        Height = 0;
        Mass = 0;
    }
/**
 * Implementacion de los metodos modificadores para los atribtos de la clase
 * @return 
 */    

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }
    
    public void setMass(float Mass) {
        this.Mass = Mass;
    }
    
    public void setAccelerationTakeoff(float AccelerationTakeoff) {
        this.AccelerationTakeoff = AccelerationTakeoff;
    }
    
/**
 * Implementacion de los metodos selectores para obtener el valor de los atributos
 * @return 
 */
    
 public String getName() {
        return Name;
    }
 
 public float getHeight() {
        return Height;
    }
 
 public float getMass() {
        return Mass;
    }
    public float getAccelerationTakeoff() {
        return AccelerationTakeoff;
    }
  
/**
 * Se declara los metod abstractos Despegar() y VElocidadOrbital(), este metodo no
 * tiene cuerpo y debe ser sobrescrito para ser implementado en las clases hijas que
 * se creen de la clase NavesEspaciales
 */
    public abstract void OrbitalSpeed();
    
}