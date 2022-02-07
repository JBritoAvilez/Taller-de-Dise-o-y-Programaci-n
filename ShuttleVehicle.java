package taller2;

import javax.swing.JOptionPane;

/**
 *Se declara la clase NaveLanzadora, indicamos que es una calse que hereda de la 
 * clase NavesEspaciales y implimenta la interfaz vuelo 
 * @author jonat
 */
public class ShuttleVehicle extends Spaceships implements Flight{
/**
 * Se declaran los atributos o caracteristicas propias de la clase NavesLanzadora
 */
    public String Load;
    public float Diameter;
    public int Stage;

    /**
     * Se implementa el constructor de la calse NavesLanzadora y llamamos el super
     * de la clase NaveEspaciales
     */
public ShuttleVehicle(){
    super();
    Load = "";
    Diameter = 0;
    Stage = 0;
}

    public ShuttleVehicle(String Name, float Height, float Mass,String Load, float Diameter, int Stage) {
        super(Name, Height, Mass);
        this.Load = Load;
        this.Diameter = Diameter;
        this.Stage = Stage;
    }
    
    
/**
 * Implementacion de los metodos modificadores para los atribtos de la clase
 * @return 
 */  
    public void setLoad(String Load) {
        this.Load = Load;
    }   

    public void setDiameter(float Diameter) {
        this.Diameter = Diameter;
    }
    
    public void setStage(int Stage) {
        this.Stage = Stage;
    }
    
/**
 * Implementacion de los metodos selectores para obtener el valor de los atributos
 * @return 
 */
     public String getLoad() {
        return Load;
    }
     public float getDiameter() {
        return Diameter;
    }

    public int getStage() {
        return Stage;
    }

    
    
    /**
     * Se sobre escribe en la clase NaveLanzadora los metos abstracto de Despegar() y
     * VelocidadOrbital()
     */
@Override
    public void Takeoff(){
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
