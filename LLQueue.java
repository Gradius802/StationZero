

/**
 * CSC-223 Queue Tester * DUE DATE: * DATE SUBMITTED:
 * PROGRAMMED BY: A. Wright
 
 *
 */
 
package radio;
//import java.util.Exc
/**
 *
 * @author A. Wright
 * CLASS DESCRIPTION:
 */
public class LLQueue<Type> implements QueueADT<Type> {
   private int count;
   private LLNode<Type> head, tail;

   /**
    * C O N S T R U C T O R
    */
   public LLQueue() {
      count = 0;
      head = tail = null;
   }

   /**
    * Mutator: enqueue() Add an element to the end of the queue (tail)
    *
    */
   public LLNode returnHead(){
       return head;
   }
   public void enqueue(Type elem) {
      LLNode<Type> node = new LLNode<Type>(elem);
      if (isEmpty()) // no item waiting in the queue currently
      {
         head = node;
      } else {
         tail.setNext(node);
      }
      tail = node;
      count++;
   }
   /**
    * Mutator: dequeue() Removes the first item from the head of the queue
    */
   public Type dequeue() throws RuntimeException {
      if (isEmpty()) {
         throw new RuntimeException("Empty queue -- cannot dequeue");
      }
      Type result = head.getElement();
      head = head.getNext();
      count--;

      if (count == 0) // empty queue
      {
         tail = null;
      }

      return result;
   }

   /**
    * Accessor first() -- returns a copy of the item at the front of the queue;
    * no remove
    *
    * @return copy of the element
    */
   public Type first() throws RuntimeException {
      if (isEmpty()) {
         throw new RuntimeException("Empty queue -- no front element");
      }

      Type result = head.getElement();
      return result;
   }

   /**
    * Accessor: isEmpty() indicates whether or not the queue has no elements
    */
   public boolean isEmpty() {
      if (head == null) {
         return true;
      } else {
         return false;
      }
   }

   /**
    * Accessor size() reports the number of elements in the queue
    *
    * @return count of items in the queue
    */
   public int size() {
      return count;
   }

   /**
    * Accessor: toString() displays the contents of the queue: </br>
    * one element after the other from front to rear
    */
   public String toString() {
      String out = "";
      LLNode<Type> current = new LLNode<Type>();
      current = head;
      if (current == null) {
         out += "Empty queue\n";
      } else {
         while (current != null) {
            out += current.getElement();
            out += "\n";
            current = current.getNext();
         }
      }
      return out;
   }
}
