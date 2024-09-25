package co.edu.uptc;

import java.util.ArrayList;

import co.edu.uptc.pojos.Person;
import co.edu.uptc.utilities.BinaryTree;
import co.edu.uptc.utilities.PersonComparator;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Person> binaryTree = new BinaryTree<Person>(PersonComparator.compName);
        binaryTree.add(new Person("ilia", 27));
        binaryTree.add(new Person("Alexandre", 28));
        ArrayList<Person> persons = binaryTree.showSortData();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}