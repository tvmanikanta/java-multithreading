public class ThreadCreationUsingThreadClass {
    public static void main(String args[]){
        Thread firstThread = new ThreadOne();
        Thread secondThread = new ThreadTwo();
        firstThread.start();
        secondThread.start();
    }
}

class ThreadOne extends Thread{

    @Override
    public void run() {
        System.out.println("Starting a new thread: Thread One");
        for(int i=0; i<15; i++){
            System.out.println("Printing from Thread One: " + i);
        }
    }

}

class ThreadTwo extends Thread{

    @Override
    public void run(){
        System.out.println("Starting a new thread: Thread Two");
        for(int i=0; i<15; i++){
            System.out.println("Printing from Thread Two: " + i);
        }
    }
}