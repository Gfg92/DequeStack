public class Element<T> {
    private Element<T> previous = null;
    private T object = null;


    public Element(T object) {
        this.object = object;
    }


    public T getObject() {
        return object;
    }
    public T getT() {
        return object;
    }

    public void setPrevious(Element<T> previous) {
        this.previous = previous;
    }

    public Element<T> getPrevious() {
        return previous;
    }

    public void delete() {
        previous = null;
        object = null;
    }

    @Override
    public String toString() {
        return "" + object;
    }
}
