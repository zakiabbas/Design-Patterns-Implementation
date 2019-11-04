
package bridgepatternn;


public class BridgePatternn {

    
    public static void main(String[] args) {
        
        ThreadScheduler Thread1 = new PreemptiveThreadSchedular(new Windows(), new Unix(), new JVM()); 
        Thread1.Schedular(); 
        ThreadScheduler Thread2 = new TimeSlicedThreadSchedular(new Windows(), new Unix(), new JVM()); 
        Thread2.Schedular();
       
    }
    
}
