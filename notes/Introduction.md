## Introduction to Multithreading

### What is Multithreading?
- Multithreading is the ability to perform different tasks concurrently.
- A multithreaded program contains two or more parts that can run concurrently. Each part of such a program is called a Thread, and
each thread defines its own path of execution.
- In a single-threaded program, when a thread blocks because it is waiting for some resource, the entire program stops running.
- Multithreading enables you to write efficient programs that make maximum use of the processing power available on the system. 
Multithreading achieves this by keeping the idle time to minimum.

### Concurrency vs Parallelism

Concurrency is the ability of a system to execute multiple tasks at the same time, or nearly overlapping times such that they appear to be executed at the same time.

Parallelism refers to the execution of multiple tasks at the same time to achieve faster performance and increased throughput. In a parallel system, tasks are executed truly simultaneously
through the use of multiple processors or multiple processor cores.

### Process vs Thread(Multitasking vs Multithreading)

- Multitasking and multithreading are both techniques for achieving concurrency, but they differ in how they are implemented and the scope of what they manage. 
- Multitasking allows multiple processes (independent programs) to run concurrently, while multithreading allows multiple threads (execution paths) within a single process to run concurrently.
- In multitasking, a program is the smallest unit of code that can be dispatched by a scheduler. In multithreading, a thread is the smallest unit of dispatch-able code.

#### Process
A process is an instance of a program. When you enter an application, it is a process. The OS assigns its own stack and heap memory area.

#### Thread
A thread is a light-weight process. It is a unit of execution within a given program. A single process may contain multiple threads.
Each thread in the process shares the memory and resources of the parent process.


### What is time slicing?
In a single core system, concurrently executing threads share the CPU, with each thread receiving a slice of CPU time.
This splitting of CPU time for execution of different threads is called time-slicing. 
Therefore, in a single-core system, two or more threads do not actually run at the same time, but the idle CPU time is utilized.





