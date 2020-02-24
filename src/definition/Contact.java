package definition;

import adt.contactADT;
import helper.Node;
import helper.Person;

import java.util.Scanner;

public class Contact implements contactADT<Person> {
    Scanner sc = new Scanner( System.in );
    int size = 0;
    private Node<Person> head;
    private Node<Person> iter;

    public Contact(){
        head = null;
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node<Person> node){
        head = node;
        iter = head;
    }   //setter for head

    @Override
    public void add(Person data){
        Node node = new Node( data );

        if(head == null) {
            head = node;
        }
        else{
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext( node );
        }
        size++;
    }

    @Override
    public void remove(){
        Node<Person> temp = head;
        Node previous = null;
        int item = printName();
        if(item == 1) {
            System.out.println( temp.getData().getFirstName() + " " + temp.getData().getLastName() + "'s contact deleted from list!" );
            head = temp.getNext();
            temp = head;
        }
        else{
            for (int i = 1; i <= size; i++) {
                if(i == item) {
                    System.out.println( temp.getData().getFirstName() + " " + temp.getData().getLastName() + "'s contact deleted from list!" );
                    previous.setNext( temp.getNext() );
                    size--;
                    break;
                }
                previous = temp;
                temp = temp.getNext();
            }
        }
    }

    //Helper method to check if linked list is empty or not
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    public void search(String firstName){
        Node<Person> temp = head;
        int count = 0;
        //to count the number of persons with the same name
        while(temp != null) {
            if(temp.getData().getFirstName().equals( firstName )) {
                count++;
            }
            temp = temp.getNext();
        }
        if(count != 0) {
            System.out.println( count + " match found!\n-------- * -------- * -------- * --------" );
            temp = head;
            while(temp != null) {
                if(temp.getData().getFirstName().equals( firstName )) {
                    System.out.println( temp.getData() );
                    System.out.println( "-------- * -------- * -------- * --------" );
                }
                temp = temp.getNext();
            }
        }
        else
            System.out.println( "No Result Found." );
    }

    @Override
    public void viewAll(){
        System.out.println( "---Here are all your contacts---\n-------- * -------- * -------- * --------" );
        Node temp = head;
        while(temp != null) {
            System.out.println( temp.getData() );
            temp = temp.getNext();
            System.out.println( "-------- * -------- * -------- * --------" + "\n" + "-------- * -------- * -------- * --------" );
        }
        System.out.println();

    }

    public int printName(){
        System.out.println( "---Here are all your contacts---" );
        Node<Person> temp = head;
        int sNo = 1;
        while(temp != null) {
            System.out.println( sNo++ + ". " + temp.getData().getFirstName() + " " + temp.getData().getLastName() );
            temp = temp.getNext();
        }
        System.out.print( "Press the number against the contact to delete it:" );
        return sc.nextInt();
    }

    public void sortList(){
        //Node current will point to head
        Node<Person> current = head, index = null;
        Person temp;

        if(head == null) {
            return;
        }
        else{
            while(current != null) {
                //Node index will point to node next to current
                index = current.getNext();
                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.getData().getFirstName().compareTo( index.getData().getFirstName() ) > 0) {
                        temp = current.getData();
                        current.setData( index.getData() );
                        index.setData( temp );
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

}
