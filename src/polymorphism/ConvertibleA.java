/**********************************************
Programmer : Anthony D'Ambrosio
Date       : 10/26/2015
Title      : Lab09
***********************************************/

package polymorphism;

public class ConvertibleA extends CarA
{
    private boolean TopUp;
    
    public ConvertibleA()
    {
        super();
        TopUp = true;
    }
    
    public ConvertibleA( boolean TopUp )
    {
        super();
        this.TopUp = TopUp;
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
        {
            System.out.println("Top is already down");
        }
    }
}
