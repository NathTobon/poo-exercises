package Services;

import Entity.Person;

public class PersonServices {

    public Person createPerson(String name, char sex, int age, int weight, double height) {
        Person person = new Person(name, sex, age, weight, height);
        return person;
    }

    public int calculateIMC(Person person) {
        int weight = person.getWeight();
        double height = person.getHeight();

        double imc = (double) weight / Math.pow((double) height, (double) 2);

        int ret = 0;
        if (imc < 20) {
            ret = -1;
        } else if (imc >= 20 && imc <= 25) {
            ret = 0;
        } else if (imc > 25) {
            ret = 1;
        }

        return ret;

    }

    public boolean isAdult(Person person) {
        int age = person.getAge();
        boolean adult = false;

        if (age >= 18) {
            adult = true;
        }
        return adult;
    }

}
