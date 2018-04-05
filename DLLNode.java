public class DLLNode<T> {
   public T info;
   public DLLNode<T> next, prev;
   
   public DLLNode(T el, DLLNode<T> p, DLLNode<T> n){
       info = el;
       prev = p;
       next = n;
   }
  
}
