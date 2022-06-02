public class LinkedStack<T extends Number> {
    private Element<T> topElement;

    public boolean empty() {
        return topElement == null;
    }

    public Element<T> peek() { //mostrar el ultimo elemento añadido
        if (topElement == null){
            System.out.println("No hay ningun elemento en tu LinkedStack");
        }
        return topElement;
    }

    public T pop() { //mostrar el elemento y borrarlo

    }

    public void push(T item) { //añadir uno arriba del todo
        Element<T> element = new Element(item);
        element.encimaDe(topElement);
        topElement = element;
    }

    public int search(Object o) {

    }

}
