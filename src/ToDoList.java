import java.util.*;

public class ToDoList<E> {
    private Queue<E> queueList;

    public ToDoList() { queueList = new LinkedList<E>(); }

    public void listDo (E object) { queueList.add(object); }

    public E doList () throws NoSuchElementException {
        return queueList.remove();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();

    }
    public void print() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.print(value + " ");
        }
    }
}
