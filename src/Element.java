public class Element<T> {

    private Element<T> next = null;
    private Element<T> previous=null;
    private T object = null;

    public Element(T object) {
        this.object = object;
    }
    public T getT(){
        return object;
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
    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element<T> getPrevious() {
        return previous;
    }

    public void debajoDe(Element<T> previous) {
        this.previous = previous;
    }
    public void delete(){
        next = null;
        object = null;
    }

    @Override
    public String toString() {
        return ""+ object;
    }
}
