public class Element<T> {

    private Element<T> next = null;
    private T object = null;

    public Element(T object) {
        this.object = object;
    }

    public Element<T> getNext() {
        return next;
    }

    public void encimaDe(Element<T> next) {
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
