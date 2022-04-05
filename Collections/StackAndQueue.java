
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Stack
*/
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        //stackInJava();
        // queueWithLL();
        queueWithQueueInterface();
    }
    
    public static void stackInJava(){
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            int x = s.pop();
            System.out.println(x);
        }
    }
    
    public static void queueWithLL(){
        LinkedList<Integer> que = new LinkedList<>();
        // add adds elements to the last, similar to addLast()
        que.add(2);
        que.add(3);
        que.add(4);
        // till here it is 2->3->4
        que.addFirst(1);
        // till here it is 1->2->3->4
        System.out.println(que.removeFirst());
        System.out.println(que.removeLast());
        // remove() is similar to removeFirst()
        System.out.println(que.remove());
    }
    
    public static void queueWithQueueInterface(){
        // Queue is an interface which is implemented by LinkedList and thus supports only those functions that are exposed by 
        // queue interface
        // public interface Queue<E> extends Collection<E>, only exposed functions like peek, poll, remove and add
        // public interface Deque<E> extends Queue<E> , offers functions that allow alteration at first level
        // public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>
        Queue<Integer> que = new LinkedList<>();
        que.add(2);
        que.add(3);
        que.add(4);
        // addFirst not allowed in queue as this interface restricts certain operations, will throw error
        // que.addFirst(1);
        // till here it is 2->3->4
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.poll());
        
    }
    
    
}
