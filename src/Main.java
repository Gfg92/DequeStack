import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<Integer> list = new LinkedStack<Integer>();
        System.out.println(list.empty());
        list.push(1);
//        list.push(2);
//        list.push(3);
//        list.push(4);
//        System.out.println(list.peek());
//        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());


//        Stack<Integer> lista = new Stack<>();
//        lista.push(10);
//        lista.push(20);
//        System.out.println(lista.pop());
//        System.out.println(lista.peek());


    }
}
