package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)

 double tax = 1.20;

 double person1 = (10 * tax);
 double person2 = (12 * tax);
 double person3 = (9 * tax);
 double person4 = (8 * tax);
 double person5 = (7 * tax);
 double person6 = (15 * tax);
 double person7 = (11 * tax);
 double person8 = (30 * tax);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
        System.out.println(person7);
        System.out.println(person8);
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

    }
}
