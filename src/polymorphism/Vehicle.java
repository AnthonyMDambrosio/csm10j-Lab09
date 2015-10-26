package polymorphism;

public abstract class Vehicle
{
    private boolean isVehicleOn;
    
    public Vehicle()
    {
        isVehicleOn = false;
    }
    
    public Vehicle( boolean isVehicleOn )
    {
        this.isVehicleOn = isVehicleOn;
    }
    
    public void Start()
    {
        System.out.println("Starting vehicle");
        isVehicleOn = true;
    }
    
    public void Drive()
    {
        if ( isVehicleOn )
            System.out.println("Driving Vehicle");
        else 
            System.out.println("Start the vehicle first");
    }  
}

