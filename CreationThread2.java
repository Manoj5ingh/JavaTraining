package p1;

class CreationThread2 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	CreationThread2 m1=new CreationThread2();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}   