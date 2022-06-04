import java.util.Deque;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<Integer> list = new LinkedStack<Integer>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println(list.search(2));


    }
}
