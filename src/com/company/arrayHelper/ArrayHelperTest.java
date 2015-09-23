package com.company.arrayHelper;

import com.company.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dmytro on 23.09.15.
 */
public class ArrayHelperTest {

    @Test
    public void testMerge() {
        Person person1 = new Person.Builder()
                .firstName("Dmytro")
                .lastname("Chernenko")
                .email("mail")
                .phone("")
                .build();

        Person person2 = new Person.Builder()
                .firstName("Petro")
                .lastname("Chernenko")
                .email("mail")
                .phone("")
                .build();

        Person person3 = new Person.Builder()
                .firstName("Vasyl")
                .lastname("Chernenko")
                .email("mail")
                .phone("")
                .build();

        Person person4 = new Person.Builder()
                .firstName("Ivan")
                .lastname("Chernenko")
                .email("mail")
                .phone("")
                .build();

        Person person5 = new Person.Builder()
                .firstName("Tamara")
                .lastname("Chernenko")
                .email("mail")
                .phone("")
                .build();

        Person[] leftArrayPerson = new Person[2];
        Person[] rightArrayPerson = new Person[3];
        Person[] expectedResult = new Person[5];



        leftArrayPerson[0] = person1;
        leftArrayPerson[1] = person2;

        rightArrayPerson[0] = person3;
        rightArrayPerson[1] = person4;
        rightArrayPerson[2] = person5;


        expectedResult[0] = person1;
        expectedResult[1] = person2;
        expectedResult[2] = person3;
        expectedResult[3] = person4;
        expectedResult[4] = person5;

        ArrayHelper<Person> arrayHelper= new ArrayHelper<Person>();
        Person[] result = arrayHelper.merge(leftArrayPerson, rightArrayPerson);



        Assert.assertArrayEquals(expectedResult, result);


    }
}