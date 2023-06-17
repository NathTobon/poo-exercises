import java.util.Scanner;

import Entity.Person;
import Services.PersonServices;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("How many people do you want to register?");
        int peopleNum = read.nextInt();
        Person[] people = new Person[peopleNum]; // Create array to save Person instance
        PersonServices perServices = new PersonServices(); // Instantiate services

        for (int i = 0; i < peopleNum; i++) {
            // Asking for data
            System.out.println("Enter your name");
            read.nextLine();
            String name = read.nextLine();

            char sex = ' ';
            boolean sexValid = false;
            do {
                System.out.println("Enter you sex");
                sex = read.next().charAt(0);
                switch (sex) {
                    case 'M', 'W', 'O':
                        sexValid = true;
                        break;
                    default:
                        sexValid = false;
                        System.out.println("Value incorrect. Please enter \"M\",  \"W\", or \"O\"");
                        break;
                }

            } while (sexValid == false);

            System.out.println("Enter your age");
            int age = read.nextInt();

            System.out.println("Enter your weight");
            int weight = read.nextInt();

            System.out.println("Enter your height");
            double height = read.nextDouble();

            // Create person
            Person person = perServices.createPerson(name, sex, age, weight, height);

            // Save registered person in people array.
            people[i] = person;
        }
        read.close();
        int[] peopleIMC = new int[peopleNum];
        boolean[] peopleAdult = new boolean[peopleNum];

        for (int i = 0; i < peopleNum; i++) {

            // Do the methods
            int imc = perServices.calculateIMC(people[i]);
            boolean adult = perServices.isAdult(people[i]);

            // Save info in arrays
            peopleIMC[i] = imc;
            peopleAdult[i] = adult;

        }

        // Compare results from peopleIMC and peopleAdult arrays

        // How many people are underweight? How many are in their ideal weight? How many
        // are overweight? Percentage.

        // How many people are underage, and how many are adults?
        double underw, idealw, overw, noAdult;
        underw = 0;
        idealw = 0;
        overw = 0;
        noAdult = 0;
        for (int i = 0; i < peopleNum; i++) {

            // Retrieve info from arrays
            if (peopleIMC[i] == -1) {
                underw++;
            } else if (peopleIMC[i] == 0) {
                idealw++;
            } else if (peopleIMC[i] == 1) {
                overw++;
            }

            if (peopleAdult[i] == false) {
                noAdult++;
            }
        }

        // Make up percentages
        underw = percentage(underw, peopleNum);
        idealw = percentage(idealw, peopleNum);
        overw = percentage(overw, peopleNum);
        noAdult = percentage(noAdult, peopleNum);
        double adult = 100 - noAdult;

        System.out.println("PERCENTAGES \nUnderweight people: " + underw
                + "\nIdeal weight people: " + idealw + "\nOverweight people: " + overw
                + "\nAdults: " + adult + "\nMinors: " + noAdult);

    }

    private static double percentage(double value, int peopleNum) {
        double ret = 0;
        ret = (value * 100) / (double) peopleNum;
        return ret;
    }

}
