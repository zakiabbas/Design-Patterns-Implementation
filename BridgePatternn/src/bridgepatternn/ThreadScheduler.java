
package bridgepatternn;


public abstract class ThreadScheduler 
{
    
    
    protected Platforms platform1; 
    protected Platforms platform2; 
    protected Platforms platform3; 
  
    protected ThreadScheduler(Platforms platform1, Platforms platform2, Platforms platform3) 
    { 
        this.platform1 = platform1; 
        this.platform2 = platform2;
        this.platform3 = platform3;
    } 
  
    abstract public void Schedular(); 
    
    
}

class PreemptiveThreadSchedular extends ThreadScheduler { 
    public PreemptiveThreadSchedular(Platforms platform1, Platforms platform2, Platforms platform3) 
    { 
        super(platform1, platform2, platform3); 
    } 
  
    @Override
    public void Schedular() 
    { 
        System.out.print("PreemptiveThreadSchedular "); 
        platform1.plat(); 
        platform2.plat(); 
        platform3.plat();
    } 
} 
  
// Refine abstraction 2 in bridge pattern 
class TimeSlicedThreadSchedular extends ThreadScheduler { 
    public TimeSlicedThreadSchedular(Platforms platform1, Platforms platform2, Platforms platform3) 
    { 
        super(platform1, platform2, platform3); 
    } 
  
    @Override
    public void Schedular() 
    { 
        System.out.print("TimeSlicedThreadSchedular "); 
        platform1.plat(); 
        platform2.plat();
        platform3.plat();
    } 
} 
