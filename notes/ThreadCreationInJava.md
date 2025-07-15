## Thread Creation in Java

- Java's multithreading is built upon the *Thread* class, its methods and its companion interface, *Runnable*.
- You create a thread by instantiating an object of type *Thread*
- The *Thread* class encapsulates a thread of execution. Since you can't directly refer to the state of a running thread, you will deal with it through
its proxy, the Thread instance that has spawned it.
- To create a new thread, you will either implement the *Runnable* interface or extend the *Thread* class.

### Implementing Runnable Interface
- *Runnable* abstracts a unit of executable code.
- To implement *Runnable*, a class needs to implement a single method called *run()*, which is declared like this:
`public void run()`. 
- Inside *run()* method, you will define the code that constitutes the new thread.
- After you create a class that implements *Runnable*, you need to instantiate an object of type *Thread* from within that class.
- *Thread* class defines several constructors, of which we can use:`Thread(Runnable runnableObject)`

  [Example](../examples/thread-basics/ThreadCreationUsingRunnable.java)

### Extending Thread Class
- You can also create a new thread by creating a new class that extends the *Thread* class and then create an instance of that class.
- The extending class must override the *run()* method, which is the entry point of the new thread.

  [Example](../examples/thread-basics/ThreadCreationUsingThreadClass.java)

### start() Method
- After a new thread is created, it will not start running until its start() method is called.

  [Example](../examples/thread-basics/ThreadCreationUsingThreadClass.java)

### isAlive() Method
- The *isAlive()* method is defined by the Thread class, and it returns true if the thread upon which it is called is still executing.

  [Example](../examples/thread-basics/JoinIsAliveMethodsExample.java)

### join() Method
- The *join()* method is defined by the thread class, and it is called to wait for the thread upon which it is called to finish.

  [Example](../examples/thread-basics/JoinIsAliveMethodsExample.java)