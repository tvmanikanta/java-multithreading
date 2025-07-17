## Main Thread and Thread Priorities in Java
### Main Thread
- When a Java program starts, one thread begins running immediately. This is called the main thread of the program.
- The other child threads are spawned from the main thread.
- The main thread is often the last thread to finish execution, because it performs various shutdown actions.
- When we create and start new threads, they run concurrently with the main thread unless instructed otherwise.
### Thread Priorities
