public class JoinIsAliveMethodsExample {
    public static void main(String args[]) throws InterruptedException{
        MyThread firstThread = new MyThread("First Thread", 1);
        MyThread secondThread = new MyThread("Second Thread", 10);

        System.out.println("Creating and running new threads");
        firstThread.thread.start();
        secondThread.thread.start();
        firstThread.thread.join();
        System.out.println("Finished executing the first thread");
        System.out.println("First thread is alive: " + firstThread.thread.isAlive());
        System.out.println("Second thread is alive: " + secondThread.thread.isAlive());
        secondThread.thread.join();
        System.out.println("All threads finished executing");
    }
}

class MyThread implements Runnable{

    String name;
    Thread thread;
    int count;

    MyThread(String name, int count){
        this.name = name;
        this.count = count;
        this.thread = new Thread(this);
    }

    @Override
    public void run(){
        System.out.println("Entered : " + name);
        for(int i=0; i<count; i++){
            if(count>5){
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException exception){
                    System.out.println(exception.getMessage());
                }
            }
            System.out.println("Printing from " + name + ": " + i);
        }
    }

}
