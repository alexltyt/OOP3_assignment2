/**
 * 
 */
package stackADT;

/**
 * @author AlexLeung
 *
 * This interface defines the operations that can be performed on a stack.
 *
 * @param <E> The type of elements stored in the stack.
 */
public interface StackADT<E> {

    /**
     * Creates an empty stack.
     * 
     * Precondition: None.
     * Postcondition: The stack is empty and ready to have elements added to it.
     */
    void createEmptyStack();

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element The element to be pushed onto the stack.
     * Precondition: None.
     * Postcondition: The element is added to the top of the stack.
     */
    void push(E element);

    /**
     * Removes and returns the topmost element from the stack.
     * 
     * @return The topmost element in the stack.
     * Precondition: The stack is not empty.
     * Postcondition: The topmost element is removed from the stack.
     */
    E pop();

    /**
     * Returns the topmost element in the stack without removing it.
     * 
     * @return The topmost element in the stack.
     * Precondition: The stack is not empty.
     * Postcondition: The stack remains unchanged.
     */
    E peek();

    /**
     * Checks if the stack is empty.
     * 
     * @return True if the stack is empty, false otherwise.
     * Precondition: None.
     * Postcondition: The stack remains unchanged.
     */
    boolean isEmpty();

    /**
     * Checks if the stack is full (only applicable if the stack has a maximum capacity).
     * 
     * @return True if the stack is full, false otherwise (or if the stack doesn't have a maximum capacity).
     * Precondition: None.
     * Postcondition: The stack remains unchanged.
     */
    boolean isFull();
}



