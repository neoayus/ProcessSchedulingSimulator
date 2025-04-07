import java.util.* ; 
import java.util.concurrent.ThreadLocalRandom; 

public class Main{
    // main function / entry point for app-
    public static void main(String[] args) throws CloneNotSupportedException{
        // cloneNotSupoortException is thrown when the clone() method is called on an object that dosen't implement a cloneable interface 
        
        Scanner scan = new Scanner(System.in);         

        System.out.print("Enter the context switch : ");  
        int context = scan.nextInt(); 
        
        System.out.print("Enter the # of processes : ");
        // reading the total number of processes  
        int numberOfTotalProcesses = scan.nextInt();  
        
         
        System.out.print("Enter the degree of MP : ");
        int degreeOfMP = scan.nextInt(); 
        
        System.out.print("Enter the number of bursts in each process : ");
        int numberOfBursts = scan.nextInt(); 


        // CPU Burst range 
        System.out.print("Enter the range of CPU bursts : ");
        System.out.print("Min: ");
        int minCPU = scan.nextInt();
        System.out.print("Max: ");
        int maxCPU = scan.nextInt();
        

        // I/O burst range 
        System.out.print("Enter the range of IO bursts : ");
        System.out.print("Min: ");
        int minIO = scan.nextInt();
        System.out.print("Max: ");
        int maxIO = scan.nextInt();

        
        // Priority range 
        System.out.print("Enter the range of priority : ");
        System.out.print("Min :");
        int minPriority = scan.nextInt() ; 
        System.out.print("Max :");
        int maxPriority = scan.nextInt(); 
        

        // Arrival time range 
        System.out.print("Enter the range of Initial Arrival Times : ");
        System.out.print("Min: ");
        int minArrival = scan.nextInt();
        System.out.print("Max: ");
        int maxArrival = scan.nextInt();

        // I/ for tau and alpha for prediction (SJF/Exponentials)
        System.out.print("Enter initial Tau :");
        int initialTau = scan.nextInt(); 
        
        System.out.print("Enter alpha :");
        double alpha = scan.nextDouble();
        
        
        // Random Type 
        System.out.print("Enter your type of generating random number of CPU/IO bursts : ");
        System.out.print("(0) for Gaussian / (other) for binomial : ");
        int type = scan.nextInt();
        boolean randomType = type == 0 ? true : false ;  
        

        // declaring the jobQueue        
    }
}