package definition;

import helper.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class MaintainContact {

    Person person = new Person();
    Scanner sc = new Scanner( System.in );

    public Person add(){
        System.out.println( "You have chosen to add a new contact:" );
        System.out.println( "Please enter the name of the person" );
        System.out.print( "First Name:" );
        person.setFirstName( sc.nextLine() );
        System.out.print( "Last Name:" );
        person.setLastName( sc.nextLine() );
        ArrayList<String> number = new ArrayList<>();


        return person;
    }
}
