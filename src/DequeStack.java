public class DequeStack<T extends Number> {
    private Element<T> topElement;

    public boolean empty() {
        return topElement == null;
    }

    public T peek() { //mostrar el ultimo elemento añadido
        if (topElement == null) {
            System.out.println("Inserte algun elemento");
            return null;
        }
        return topElement.getObject();
    }

    public T pop() { //mostrar el elemento y borrarlo
        if (topElement == null) {
            System.out.println("Inserte algun elemento");
            return null;
        }
        T obj = topElement.getObject();
        topElement = topElement.getPrevious();
        return obj;
    }

    public void push(T item) { //añadir uno arriba del tot
        Element<T> element = new Element<>(item);
        element.setPrevious(topElement);
        topElement = element;
    }

    public int search(Object o) {
        Element<T> element = topElement;
        int posicion = 0;
        while (element != null) {
            posicion++;
            if (element.getObject().equals(o)) {
                return posicion;
            }
            element = element.getPrevious();
        }
        return posicion;
    }

}
