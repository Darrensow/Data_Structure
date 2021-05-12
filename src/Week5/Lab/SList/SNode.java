package Week5.Lab.SList;

public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode(E item) {
        this.element = item;
    }

    public SNode() {
        this.element = null;
    }
}
