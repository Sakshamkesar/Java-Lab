class myThread extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++){
      System.out.println("Child thread :" + i);
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
    myThread T1 = new myThread();
    T1.start();
    
    try{
      T1.join();
    } catch (InterruptedException e){
        System.out.println(e);
          }
    
    System.out.println("main thread resume execution...");
  }
}
    
