public class LinkedStack<T extends Number> {
    private Element<T> topElement;

    public boolean empty() {
        return topElement == null;
    }

    public Element<T> peek() { //mostrar el ultimo elemento añadido
        return (Element<T>) topElement.getObject();
    }

//    public T pop() { //mostrar el elemento y borrarlo
//
//    }

    public void push(T item) { //añadir uno arriba del tot
        Element<T> element = new Element(item);
        element.encimaDe(topElement);
        topElement = element;
    }

//    public int search(Object o) {
//
//    }

}
