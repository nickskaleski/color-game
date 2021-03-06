
public class Phone extends Device{
	
	public Phone(Build device1, Build device2) 
    { 
        super(device1, device2); 
    } 
  
    @Override
    public void manufacture() 
    {  
    	System.out.println("phone: ");
        device1.putTogetherDevice(); 
        device2.putTogetherDevice(); 
    } 
    
    public void upgrade()
    {
    	device1.upgradeDevice();
    	device2.upgradeDevice();
    }
    
    public void installSpeaker() {
    	device1.installBettterSpeaker();
    	device2.installBettterSpeaker();
    }

}
