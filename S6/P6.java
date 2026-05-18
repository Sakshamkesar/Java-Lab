class Counter{
    int count = 0;
    
    public synchronized void increment(){
        count++;
    }
}

class myThread extends Thread{
    Counter counter;
    
    public myThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i<1000; i++){
            counter.increment();
        }
    }
}

public class main{
    public static void main(String[] args){
        Counter counter = new Counter();
        myThread t1 = new myThread(counter);
        myThread t2 = new myThread(counter);
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println(e);
            }

        
        System.out.println("final counter value : " + counter.count);
    }
}
        
        
