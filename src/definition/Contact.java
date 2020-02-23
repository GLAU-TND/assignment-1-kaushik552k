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

    @Override
    public void add(Person data){

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
