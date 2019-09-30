

/**
 * CSC-323 Linked List Stack Node class * DUE DATE:
 * DATE SUBMITTED:
 * PROGRAMMED BY: A. Wright
 
 *
 */
 
package radio;

/**
 *
 * @author A. Wright
 * CLASS DESCRIPTION: A node is a container for any class type
 * with a link (reference) to the next Node
 */
public class LLNode<T> {
   private T element;
   private LLNode<T> next;

   /**
    * C O N S T R U C T O R
    * default set node and next to null
    */
   public LLNode() {
      element = null;
      next = null;
   }

   /**
    * C O N S T R U C T O R
    * conversion set node to input element and and next to null
    */
   public LLNode(T inElem) {
      element = inElem;
      next = null;
   }

   /**
    * Accessor: getElement()
    *
    * @return this LLNode
    */
   public T getElement() {
      return element;
   }

   /**
    * Accessor: getNext()
    *
    * @return reference to next LLNode
    */

   public LLNode<T> getNext() {
      return next;
   }

   /**
    * Mutator: setElement(T inputElement) allow user/client to change the value
    * of the Node
    *
    */
   public void setNode(T inElem) {
      element = inElem;
   }

   /**
    * Mutator: setNext( LLNode<T> ptr)
    *
    * @return reference to next LLNode
    */

   public void setNext(LLNode<T> nodePtr) {
      next = nodePtr;
   }
   public boolean hasNext(){
    return !(next == null);
}
}
