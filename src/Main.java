public class Main {
    public static void main(String[] args) {
        DequeStack<Integer> list = new DequeStack<Integer>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println(list.search(2));


    }
}
