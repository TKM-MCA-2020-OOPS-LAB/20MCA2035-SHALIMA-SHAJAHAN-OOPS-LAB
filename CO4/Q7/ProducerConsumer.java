package myproject;
import java.util.LinkedList;


public class ProducerConsumer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 Thread t1 = new Thread(new Producer(list), "Producer");
		 Thread t2 = new Thread(new Consumer(list), "Consumer");
		 t1.start();
		 t2.start(); 
		}
		}

		class Producer implements Runnable{
		LinkedList<Integer> list;
		Producer(LinkedList<Integer> list){
		 this.list = list;
		}
		@Override
		public void run() {
		 for(int i = 1; i <=6; i++){
		   synchronized(list) {
		     
		     while(list.size() >= 1){
		       System.out.println("Waiting for consumer to consume as queue is full..");
		       try {
		         list.wait();
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		     System.out.println("Adding to queue- " + Thread.currentThread().getName() + " " + i);
		     list.add(i);
		     list.notify();    
		   }
		 }		
		}
		}
		
		class Consumer implements Runnable{
		LinkedList<Integer> list;
		Consumer(LinkedList<Integer> list){
		 this.list = list;
		}
		@Override
		public void run() {
		 for(int i = 1; i <= 6; i++){
		   synchronized(list) {
		     
		     while(list.size() < 1){
		       System.out.println("Waiting for producer to produce as queue is empty..");
		       try {
		         list.wait();
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		    
		     System.out.println("Consumed the element- " + Thread.currentThread().getName() + " " + list.remove());
		     list.notify();  
		   }
		 }		
		


	}
}


