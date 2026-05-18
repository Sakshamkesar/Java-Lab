class myThread extends Thread {
  public myThread(String name){
      super(name);
  }
  public void run() {
    for (int i = 0; i < 5; i++){
      System.out.println("thread: " + Thread.currentThread().getName() +
       " | priority: " + Thread.currentThread().getPriority() +
       " value: " + i);
      try{
        Thread.sleep(500);
      } catch (InterruptedException e){
          System.out.println(e);
            }
    }
  }
}

public class threadExample {
  public static void main(String[] args){
    myThread T1 = new myThread("min priority thread");
     myThread T2 = new myThread("normal priority thread");
     myThread T3 = new myThread("max priority thread");
    
    T1.setPriority(Thread.MIN_PRIORITY);
    T2.setPriority(Thread.NORM_PRIORITY);
    T3.setPriority(Thread.MAX_PRIORITY);
    
    T1.start();
    T2.start();
    T3.start();

  }
}
    
