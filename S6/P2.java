class myRunnable implements Runnable  {
  public void run() {
    for (int i = 0; i < 5; i++){
      System.out.println("Child thread : (" + Thread.currentThread().getName() + ")" + i);
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
    myRunnable obj = new myRunnable();
    Thread T1 = new Thread(obj);
    T1.start();
    
    for (int i = 0; i < 5; i++){
      System.out.println("Main Thread:" + i);
      try{
        Thread.sleep(500);
      } catch (InterruptedException e){
          System.out.println(e);
            }
    }
    System.out.println("main thread executed");
  }
}
    
