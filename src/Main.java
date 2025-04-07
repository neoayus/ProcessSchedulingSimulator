import java.util.* ; 
import java.util.concurrent.ThreadLocalRandom; 

public class Main{
    // main function / entry point for app-
    public static void main(String[] args) throws CloneNotSupportedException{
        // cloneNotSupoortException is thrown when the clone() method is called on an object that dosen't implement a cloneable interface 
        
        Scanner scan = new Scanner(System.in);         

        System.out.println("Enter the context switch : ");  
        int context = scan.nextInt(); 
        
        System.out.println("Enter the # of processes : ");
        // reading the total number of processes  
        int numberOfTotalProcesses = scan.nextInt();  
        
         
        System.out.println("Enter the degree of MP : ");
        int degreeOfMP = scan.nextInt(); 
        
        System.out.println("Enter the number of bursts in each process : ");
        int numberOfBursts = scan.nextInt(); 


        // CPU Burst range 
        System.our.println("Enter the range of CPU bursts : ");
        System.out.prinln("Min: ");
        int minCPU = scan.nextInt();
        System.out.prinln("Max: ");
        int maxCPU = scan.nextInt();
        

        // I/O burst range 
        System.out.println("Enter the range of IO bursts : ");
        System.out.println("Min: ");
        int minIO = scan.nextInt();
        System.out.println("Max: ");
        int maxIO = scan.nextInt();

        
        // Priority range 
        System.out.println("Enter the range of priority : ");
        System.out.println("Min :");
        int minPriority = scan.nextInt() ; 
        System.out.println("Max :");
        int maxPriority = scan.nextInt(); 
        

        // Arrival time range 
        System.out.println("Enter the range of Initial Arrival Times : ");
        System.out.println("Min: ");
        int minArrival = scan.nextInt();
        System.out.println("Max: ");
        int maxArrival = scan.nextInt();

        // I/ for tau and alpha for prediction (SJF/Exponentials)
        System.out.println("Enter initial Tau :");
        int initialTau = scan.nextInt(); 
        
        System.out.println("Enter alpha :");
        double alpha = scan.nextDouble();
        
        
        // Random Type 
        System.out.println("Enter your type of generating random number of CPU/IO bursts : ");
        System.out.println("(0) for Gaussian / (other) for binomial :");
        int type = scan.nextInt();
        boolean randomType = type == 0 ? true : false ;  
        

        // declaring the jobQueue        
    }
}