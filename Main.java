/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**1
 *
 * @author jonat
 */
public class Main {
    /**
    *Se impleneta el metodo con el menu de opciones de la aplicacion
    */
    public static int menu(){
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== CREACION DE NAVES ESPACIALES PORFAVOR ELIJA CUAL CREAR ===== \n\n"
                    + "1.Creacion de nave lanzadora\n" 
                    + "2. Creacion de nave no tripulada\n"
                    + "3. Creacion de nave tripulada\n"
                    + "4. Salir \n"
                    + "\n Seleccione una opción del 1 al 4\""));
            
        }while (opcion <=0 || opcion > 4);
                return opcion;
            
        
    }
    
    /**
     *Se crea el metodo que permite captura la informacion correspondiente de las Naves Espaciales
     *Se pasa como paramtero un objeto de la clase NavesEspaciales para enviar la informacion capturada
     *a los respectivos metodos modificadores 
    */
    public static void CapturarDatos(Spaceships Ss){
        
        String N = JOptionPane.showInputDialog("Escribe el nombre que desea tener su nave");
        Ss.setName(N);
        float H = Float.parseFloat(JOptionPane.showInputDialog("Pofavor digite la Altura de su nave, la cual se tomara la medidas en M"));
        Ss.setHeight(H);
        float M =Float.parseFloat(JOptionPane.showInputDialog("Pofavor digite la Masa de su nave, la cual se tomara la medidas en Tonelada"));
        Ss.setMass(M);
        float AT =Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la velocidad de despegue la cual debe de ser mayor a 11.19 K/s"));
        Ss.setAccelerationTakeoff(AT);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * Se crea los objeots de las clase NaveLanzadora(SV), NaveNoTripulada(US) y
     * NAveTripulada(MS)
     */ 
       ShuttleVehicle SV = new ShuttleVehicle();
       UnmannedSpaceShip US = new UnmannedSpaceShip();
       MannedSpaceship MS = new MannedSpaceship();

        int option;
        do{
            option = menu();
            switch(option){
                case 1: 
                    /**
                     * En la primera opcion del menu se captra la informacion de la NaveLanzadora y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(SV);
                    String L = JOptionPane.showInputDialog("Porfavor digite la Carga que desas llevar");
                    SV.setLoad(L);
                    float D = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite el Diametro que sea tener su nave"));
                    SV.setDiameter(D);
                    int S = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el nuemro de Etapas que deseas tener en tu nave"));
                    SV.setStage(S);
                    JOptionPane.showConfirmDialog(null,"Su nave a sido creada con las siguientes medidas"
                                                  +"\nEl nombre de tu nave es: "+SV.getName()
                                                  +"\nTiene una altura de: "+SV.getHeight()+"m"
                                                  +"\nTiene una masa de: "+SV.getMass()+"t"
                                                  +"\nTu nave lleva la carga llamada: "+SV.getLoad()
                                                  +"\nTiene un diametro de: "+SV.getDiameter()+"m3"
                                                  +"\nTu nave cuenta con: "+SV.getStage()+" etapas"
                                                  );
                    SV.Takeoff();
                    SV.OrbitalSpeed();
                                                    
                    break;
                case 2:
                    /**
                     * En la primera opcion del menu se captra la informacion de la NaveNoTripulada y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(US);
                    float Le = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la Longitud de su nave"));
                    US.setLength(Le);
                    float B = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite el Ancho que desea tener su nave"));
                    US.setBroad(B);
                    int En = Integer.parseInt(JOptionPane.showInputDialog("Digite porfavor el numero de Motores que deseaa tener su nave"));
                    US.setEngines(En);
                    JOptionPane.showInputDialog(null,"Sunave a sido creada con las siguientes medidas"
                                                +"\nEl nombre de tu nave es: "+US.getName()
                                                +"\nTiene una altura de: "+US.getHeight()+"m"
                                                +"\nTiene una masa de: "+US.getMass()+"t"
                                                +"\nTiene una longitud de: "+US.getLength()
                                                +"\nTiene una Longitud de: "+US.getBroad()
                                                +"\nSu nave cuenta con "+US.getEngines()+" motores"
                                                );
                    US.Takeoff();
                    US.OrbitalSpeed();
                    break;
                case 3:
                    /**
                     * En la primera opcion del menu se captra la informacion de la NaveTripulada y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(MS);
                    float CH = Float.parseFloat(JOptionPane.showInputDialog("Porfavod digite la Altura de la capsula la cual estara medida en metros"));
                    MS.setCapsuleHeight(CH);
                    float RH = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la Altura que desea tener su cohete el cual estara medido en metro"));
                    MS.setRocketHeight(RH);
                    int CM = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el Numero de Tripulante que ira en la nave"));
                    MS.setCrewMember(CM);
                    JOptionPane.showInputDialog(null+"Sunave a sido creada con las siguientes medidas"
                                                +"\nEl nombre de tu nave es: "+MS.getName()
                                                +"\nTiene una altura de: "+MS.getHeight()+"m"
                                                +"\nTiene una masa de: "+MS.getMass()+"t"
                                                +"\nSu capsula tiene una altura de: "+MS.getCapsuleHeight()+"m"
                                                +"\nSu cohete tiene una altura de: "+MS.getRocketHeight()+"m"
                                                +"\nLlevas "+MS.getCrewMember()+" tripulantes");
                    MS.Takeoff();
                    MS.OrbitalSpeed();
                    break;
                case 4:
                    break;
            }
        }while (option !=4);
    }
    
}
