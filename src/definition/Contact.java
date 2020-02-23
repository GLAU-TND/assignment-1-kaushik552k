package definition;

import adt.contactADT;
import helper.Node;
import helper.Person;

import java.util.Scanner;

public class Contact implements contactADT<Person> {
    Scanner sc = new Scanner( System.in );
    Node<Person> head;

    public Contact(){
        head = null;
    }

    public Node getHead(){
        return head;
    }

    @Override
    public void add(Person data){
        Node node = new Node( data );

        if(head == null) {
            head = node;
        }

    }

    @Override
    public void remove(){

    }

    @Override
    public void search(String firstName){

    }

    @Override
    public void viewAll(){

    }
}
