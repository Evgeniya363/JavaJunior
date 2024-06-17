package ru.gb.homework2;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class AnnotationsMain {

    public static void main(String[] args) {
        Person rndPerson = ObjectCreator.createObj(Person.class);
        System.out.println("age1 = " + rndPerson.age1);
        System.out.println("date = " + rndPerson.date);
        System.out.println("instatn = " + rndPerson.instant);
        System.out.println("localdate = " + rndPerson.localDate);
        System.out.println("localdatetime = " + rndPerson.localDateTime);
    }

    public static class Person {

        @Random() // рандомное число в диапазоне [0, 100)
        private Integer age1;

        @Random(min = 50, max = 51) // рандомное число в диапазоне [50, 51) => 50
        private Integer age2;

        @RandomDate()
        private Date date;
        @RandomDate()
        private Instant instant;
        @RandomDate()
        private LocalDate localDate;
        @RandomDate()
        private LocalDateTime localDateTime;
    }

}
