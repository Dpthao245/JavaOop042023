package bt02.company;

import bt02.person.Person;

public class Company {


    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Phương");
        person.setAge(25);
        person.setGender("Name");

        System.out.println("Name: " + person.getName());
        System.out.println("Name: " + person.getAge());
        System.out.println("Name: " + person.getGender());

    }
}
