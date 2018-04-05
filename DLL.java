public class DLL<T>{

   private DLLNode<T> head, tail;
      
    public String toString(){
        DLLNode<T> p;
        String s = "";
        for(p = head; p != null; p = p.next)
            s = s + p.info.toString() + " ";
         return s;
    }
   
    public void addToHead(T el){
        if(isEmpty()){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        }
        else{
            head = new DLLNode<T>(el,null,head);
            head.next.prev = head;
        }
    }
    
    public void addToTail(T el){
        if(isEmpty()){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        }
        else{
            tail.next = new DLLNode<T>(el,tail,null);
            tail = tail.next;
            tail.prev.next = tail;
        }
    }
    
    public T deleteFromHead(){
        if(isEmpty()) 
            return null;
        
        T el = head.info;
        
        if(head == tail)
            head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        return el;
    }
    
    public T deleteFromTail(){
        if(isEmpty()) 
            return null;
        
        T el = tail.info;
        
        if(head == tail)
            head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        return el;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public String toStringReverse(){
        DLLNode<T> p;
        String s = "";
        for(p = tail; p != null; p = p.prev)
            s = s + p.info.toString() + " ";
         return s;
    }
    
    public void addBefore(T el, T add){
        if(isEmpty()){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        }
        
        else{
            DLLNode<T> p;
            for(p = head; p.next != null; p = p.next){
                if(p.next.info.equals(el)){
                    p.next = new DLLNode<T>(add,p,p.next);
                    p.next.next.prev = p.next;
                    break;
                }
            }
        }
    
    }
    
    public T delete(T el){
        if(isEmpty()) 
           return null;
        
        if(el.equals(head.info)){
           return deleteFromHead();
        }
        if(el.equals(tail.info)){
           return deleteFromTail();
        }
        
        DLLNode<T> pred = head;
        DLLNode<T> t = head.next;
        while(t != null && !t.info.equals(el)){
            pred = pred.next;
            t = t.next;
        }
        
        if(t == null) return null;
        else{
            pred.next = t.next;
            pred.next.prev = pred;
        }
     
        return el;
    }
    
    public void InsertSort(T el){
        if(isEmpty()){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        }
        
        else{
            DLLNode<T> p;
            for(p = head; p.next != null; p = p.next){
                if(Integer.parseInt(el+"") < Integer.parseInt(p.next.info+"")){
                    p.next = new DLLNode<T>(el,p,p.next);
                    p.next.next.prev = p.next;
                    break;
                }
            }
        }
    }
    
}
