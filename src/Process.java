import java.util.ArrayList;  // to use resizable arrays

public class Process implements Cloneable{ // Cloneable is an Interface that allows to make the class cloneable 
    int pID; // process id 
    
    static int counter = 0; 

    int priority; // priority value for priority scheduling 
    int arrivalTime; // when the process arrives in the ready queue 
    Burst[] content; // an array or CPU and I/O bursts 
    int currentBurst; // track the current burst Index the process in on
    int timeInTheSystem; // time spent in tht system ( waiting + execution)
    int timeOfCurrentCPUBurst; // tracks time left in the current CPU Burst 
    
    int temp; 

    double tau; // predicted burst time (SJF/SRTF w exponential averaging)
    double alpha; // weight used in exponential averaging to predict tau.

    int holder;
    

    public Process(int priority, int arrivalTime, Burst[] content, int tau){
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.content = content; 
        pID = counter++;
        this.tau = tau ; 
    }
    
    public void decrementFCFS(){
        content[currentBurst].applyWork(1); // reduces the remaining time of the burst by one unit 
    }
    
    public void decrement(){
        // while (currentBurst != content.length && content[currentBurst].type)
        if(content[currentBurst].timeNeeded != 0 && content[currentBurst].type){
            content[currentBurst].applyWork(1);
            if(content[currentBurst].timeNeeded == 0){
                currentBurst++;
                if(currentBurst < content.length && !content[currentBurst].type){
                    updateTau(); 
                }
            }
        }
    }
    

    public boolean isCPU(){ // tells whether the current Burst is CPU or IO 
        if(currentBurst != content.length){
            return content[currentBurst].type;
        }else{
            return false;
        }
    }
    
    public int getTimeOfCurrentCPUBurst(){
        System.out.println("Accessed !" + pID);
        
        // check it later for changes
        int sum = 0;
        temp = currentBurst;
        System.out.println("temp caculated");
        while(temp < content.length && content[temp].type){
            sum += content[temp].timeNeeded;
            temp++;
        }
        System.out.println(pID);
        System.out.println("sum = " + sum);
        holder = sum; 
        return sum;
    }
    
    
    // SJF/SRTF Specific : 
    public double getExpAveraging(){
        System.out.println("Accessed !(exp) " + pID);
        return tau * alpha + (1 - alpha) * getTimeOfCurrentCPUBurst();           
        
    }
    public void updateTau(){
        System.out.println("holder : " + holder);
        tau = tau * alpha + (1-alpha) * holder;
        System.out.println("this is tau wowah :: " + pID + "::::" + tau);
    }
    

    public void incrementBurst(){
        currentBurst += temp;
    }
    public String toString(){
        return arrivalTime + " :: " + arrivalTime;
    }

    protected Object clone() throws CloneNotSupportedException{
        Process  var = (Process) super.clone(); 
        var.content = new Burst[content.length]; 
        for(int i=0; i < content.length; i++){
            var.content[i] = (Burst) content[i].clone();
        }
        return var;
    }

}