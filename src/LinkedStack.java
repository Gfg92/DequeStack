public class LinkedStack<T extends Number> {
    private Element<T> topElement;

    public boolean empty() {
        return topElement == null;
    }

    public Element<T> peek() { //mostrar el ultimo elemento añadido
        if (topElement == null) {
            System.out.println("Inserte algun elemento");
        }
        return topElement;
    }

    public T pop() { //mostrar el elemento y borrarlo
        T obj;
        obj = peek().getT();
        topElement = peek().getPrevious();

        return obj;


    }

    public void push(T item) { //añadir uno arriba del tot
        Element<T> element = new Element(item);
        if (topElement != null) {
            element.debajoDe(topElement);
        }
        element.encimaDe(topElement);
        topElement = element;
    }
//
//    public int search(Object o) {
//
//    }

}
