## Thread Creation in Java

- Java's multithreading is built upon the *Thread* class, its methods and its companion interface, *Runnable*.
- The *Thread* class encapsulates a thread of execution. Since you can't directly refer to the state of a running thread, you will deal with it through
its proxy, the Thread instance that has spawned it.
- To create a new thread, you will either implement the *Runnable* interface or extend the *Thread* class.