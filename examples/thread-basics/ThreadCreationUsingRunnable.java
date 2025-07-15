class ThreadCreationUsingRunnable{
    public static void main(String args[]){
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread= new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }
}

class FirstThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Starting a new thread: Thread one");
        for(int i=0; i<10; i++){
            System.out.println("Printing from Thread One: " + i);
        }
    }

}

class SecondThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Starting a new Thread: Thread two");
        for(int i=0; i<5; i++){
            System.out.println("Printing from Thread Two: " + i);
        }
    }

}