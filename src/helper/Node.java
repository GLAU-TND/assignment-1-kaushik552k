package helper;

public class Node<Person> {
    private Person data;
    private Node<Person> next;

    public Node(Person data){
        this.data = data;
        next = null;
    }

}
