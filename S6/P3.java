class myThread extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++){
      System.out.println("before sleep " + i);
      try{
        Thread.sleep(1000);
      } catch (InterruptedException e){
          System.out.println(e);
            }
      System.out.println("after sleep " + i);
    }
  }
}

public class threadExample {
  public static void main(String[] args){
    myThread T1 = new myThread();
    T1.start();
    

    System.out.println("main thread running.....");
  }
}
    
