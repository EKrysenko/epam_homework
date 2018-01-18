package hackerrank;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectOrientedProgramming {

    class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }

    class Arithmetic {

        int add(int a, int b) {
            return (a + b);
        }

    }

    class Adder extends Arithmetic {
    }

    abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    class MyBook extends Book {
        @Override
        void setTitle(String title) {
            this.title = title;
        }
    }

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; ++i) {
                sum = n % i == 0 ? sum + i : sum;
            }
            return sum;
        }
    }

    class Sports {
        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }
    }

    class BiCycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    class MotorCycle extends BiCycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());
            String temp = super.define_me();
            System.out.println("My ancestor is a cycle who is " + temp);
        }
    }

    private class Student{}
    private class Rockstar{}
    private class Hacker{}

    static String count(ArrayList myList){
        int a = 0,b = 0,c = 0;
        for (Object element : myList) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        return Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
    }

    static Iterator func(ArrayList myList){
        Iterator it=myList.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof java.lang.String)
                break;
        }
        return it;

    }
}
