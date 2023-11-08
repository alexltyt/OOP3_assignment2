/**
 * 
 */
package queueADT;

/**
 * @author AlexLeung
 *
 * This interface defines the operations that can be performed on a queue.
 *
 * @param <E> The type of elements stored in the queue.
 */
public interface QueueADT<E> {

    /**
     * Creates an empty queue.
     * 
     * Precondition: None.
     * Postcondition: The queue is empty and ready to have elements added to it.
     */
    void createEmptyQueue();

    /**
     * Enqueues an element to the end of the queue.
     * 
     * @param element The element to be enqueued.
     * Precondition: None.
     * Postcondition: The element is added to the end of the queue.
     */
    void enqueue(E element);

    /**
     * Dequeues and returns the first element from the queue.
     * 
     * @return The first element in the queue.
     * Precondition: The queue is not empty.
     * Postcondition: The first element is removed from the queue.
     */
    E dequeue();

    /**
     * Returns the first element in the queue without removing it.
     * 
     * @return The first element in the queue.
     * Precondition: The queue is not empty.
     * Postcondition: The queue remains unchanged.
     */
    E peek();

    /**
     * Checks if the queue is empty.
     * 
     * @return True if the queue is empty, false otherwise.
     * Precondition: None.
     * Postcondition: The queue remains unchanged.
     */
    boolean isEmpty();
}