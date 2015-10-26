/**********************************************
Programmer : Anthony D'Ambrosio
Date       : 10/26/2015
Title      : Lab09
***********************************************/

package interfaces;

public class CarB implements Drivable
{
    private boolean isVehicleOn;
    
    public CarB()
    {
        isVehicleOn = false;
    }
    
    public CarB( boolean isVehicleOn )
    {
        this.isVehicleOn = isVehicleOn;
    }
    
    @Override
    public void Start()
    {
        System.out.println("Starting vehicle");
        isVehicleOn = true;
    }
    
    @Override
    public void Drive()
    {
        if ( isVehicleOn )
            System.out.println("Driving vehicle");
        else
            System.out.println("Start the vehicle first");
    }
}
