package helper;

public class Node<Person> {
    private Person data;
    private Node<Person> next;

    public Node(Person data){
        this.data = data;
        next = null;
    }

    public Person getData(){
        return data;
    }

    public void setData(Person data){
        this.data = data;
    }

    public Node<Person> getNext(){
        return next;
    }

    public void setNext(Node<Person> next){
        this.next = next;
    }

}
