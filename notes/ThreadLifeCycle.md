## Thread Lifecycle


Threads exist in several states:
- A thread can be running.
- A thread can be ready to run as soon as it gets CPU time.
- A running thread can be suspended, which temporarily halts its activity.
- A suspended thread can be resumed, allowing it to pick where it left off.
- A thread can be blocked when waiting for a resource.
- At any time, a thread can be terminated, which halts its execution. Once terminated, a thread can not be resumed.


#### States of a Thread:
1. **New state** : Every thread is in this state until the execution of the thread starts.
2. **Active state** : Every thread is in this state once the execution of the thread starts. It has two sub-states: runnable and running
3. **Blocked state** : Every thread is in this state when it's waiting for some thread to finish.
4. **Terminated state** : Every thread is in this state after it is done doing its required task.

