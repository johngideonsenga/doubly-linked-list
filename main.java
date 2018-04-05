import java.io.*;

public class main {
    public static void main(String Args[])throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        DLL<Integer> dlist = new DLL<Integer>();
        
        dlist.addToTail(5);
        dlist.addToTail(10);
        dlist.addToTail(15);
        dlist.addToTail(30);
        dlist.InsertSort(25);
        
        System.out.print(dlist.toString());
        
    
    }      
}
