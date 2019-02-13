package p1;
public class Thread_Daemon extends Thread 
{ 
    public Thread_Daemon(String name){ 
        super(name); 
    } 
  
    public void run() 
    {  
        // Checking whether the thread is Daemon or not 
        if(Thread.currentThread().isDaemon()) 
        {  
            System.out.println(getName() + " is Daemon thread");  
        }  
          
        else
        {  
            System.out.println(getName() + " is User thread");  
        }  
    }  
      
    public static void main(String[] args) 
    {  
      
        Thread_Daemon t1 = new Thread_Daemon("t1"); 
        Thread_Daemon t2 = new Thread_Daemon("t2"); 
        Thread_Daemon t3 = new Thread_Daemon("t3"); 
      
        // Setting user thread t1 to Daemon 
        t1.setDaemon(true); 
              
        // starting first 2 threads  
        t1.start();  
        t2.start(); 
  
        // Setting user thread t3 to Daemon 
        t3.setDaemon(true);  
        t3.start();         
    }  
} 