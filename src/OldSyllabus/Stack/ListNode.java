package OldSyllabus.Stack;

public class ListNode<T> {
    private T data;
    private ListNode link;

    /**
     * Creates a new node
     * @param data The data inside a node
     * @param link Pointer to the next node
     */
    public ListNode(T data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    public ListNode() {
        this.data = null;
        this.link = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getLink() {
        return link;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "<--" + this.data;
    }
}
