package interfaces;

public class ConvertibleB implements Drivable
{
    private boolean VehicleOn;
    private boolean TopUp;
    
    public ConvertibleB()
    {
        VehicleOn = false;
        TopUp = true;
    }
    
    public ConvertibleB( boolean VehicleOn, boolean TopUp )
    {
        this.VehicleOn = VehicleOn;
        this.TopUp = TopUp;
    }
    
    @Override
    public void Start()
    {
        System.out.println("Starting vehicle");
        VehicleOn = true;
    }
    
    @Override
    public void Drive()
    {
        if ( VehicleOn )
            System.out.println("Driving vehicle");
        else
            System.out.println("Start the vehicle first");
    }
    
    public void PutTopUp()
    {
        if ( TopUp )
            System.out.println("Top is already up");
        else
        {
            System.out.println("Putting top up");
            TopUp = true;
        }
            
    }
    
    public void PutTopDown()
    {
        if ( TopUp )
        {
            System.out.println("Putting top down");
            TopUp = false;
        }
        else 
            System.out.println("Top is already down");
        
    }
}
