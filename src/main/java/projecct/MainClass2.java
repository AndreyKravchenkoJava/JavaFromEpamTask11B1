package projecct;

import java.util.LinkedList;

public class MainClass2 {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person(1));
        people.add(new Person(2));
        people.add(new Person(3));
        people.add(new Person(4));
        people.add(new Person(5));
        people.add(new Person(6));
        people.add(new Person(7));
        people.add(new Person(8));
        people.add(new Person(9));
        people.add(new Person(10));

        System.out.println("Circle of people: " + people);

        while (people.size() > 1) {
            for (int i = 0; i < people.size(); i++) {
                if (i % 2 == 1) {
                    people.remove(i);
                }
            }
        }

        System.out.println("Circle of people with every second person crossed out: " + people);
    }
}
