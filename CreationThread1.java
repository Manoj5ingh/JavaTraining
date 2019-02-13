package p1;

class CreationThread1 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
	CreationThread1 t1=new CreationThread1();  
t1.start();  
 }  
}    