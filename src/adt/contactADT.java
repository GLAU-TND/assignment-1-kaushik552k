package adt;

import helper.Person;

public interface contactADT {
    /**
     * this method is used to add a person details
     *
     * @param data information about a single person
     */
    public void add(Person data);

    /**
     * this method is used to remove the person details
     */
    public void remove();

    /**
     * this method is used to search a person from the list according to first name
     *
     * @param firstName first name of the person
     */
    public void search(String firstName);

    /**
     * this method is used to display all the elements in a list
     */
    public void viewAll();

}
