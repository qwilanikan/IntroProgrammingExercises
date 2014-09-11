package com.thoughtworks;

public class IntroProgrammingExercises {

    //Easiest exercise ever
    //Print one asterisk to the console.
    //Example:
    //        *
    public void easiestExerciseEver(){
        System.out.println("*");
    }


    //Draw a horizontal line
    //Given a number n, print n asterisks on one line.
    //Example when n=8:
    //        ********
    public void drawAHorizontalLine(int n){
        while (n > 0) {
            System.out.print("*");
            n--;
        }
        System.out.println();
    }

    //Draw a vertical line
    //Given a number n, print n lines, each with one asterisks
    //Example when n=3:
    //        *
    //        *
    //        *
    public void drawAVerticalLine(int n){
        while (n > 0) {
            System.out.println("*");
            n--;
        }
    }

    //Draw a right triangle
    //Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
    //Example when n=3:
    //        *
    //        **
    //        ***
    public void drawARightTriangle(int n){
        int width = 1;
        while (n > 0) {
            int w = width;
            while (w >  0) {
                System.out.print("*");
                w--;
            }
            System.out.println();
            width++;
            n--;
        }
    }

    //Isosceles Triangle
    //Given a number n, print a centered triangle. Example for n=3:
    //          *
    //         ***
    //        *****
    public void isoscelesTriangle(int n){
        int width = 1;
        int whiteSpace = n - 1;
        while (n > 0) {
            int w = width;
            int s = whiteSpace;
            while(s > 0){
                System.out.print(" ");
                s--;
            }
            while (w >  0) {
                System.out.print("*");
                w--;
            }
            System.out.println();
            width+=2;
            whiteSpace--;
            n--;
        }
    }

    //Diamond
    //Given a number n, print a centered diamond. Example for n=3:
    public void diamond(int n){
        int height = n + n - 1;
        int width = 1;
        int whiteSpace = n - 1;
        boolean goingUp = true;
        while (height > 0) {

            int w = width;
            int s = whiteSpace;
            while(s > 0){
                System.out.print(" ");
                s--;
            }
            while (w >  0) {
                System.out.print("*");
                w--;
            }
            System.out.println();
            if (n == 1){
                goingUp = false;
            }
            if (goingUp == true){
                width+=2;
                whiteSpace--;
                height --;
                n--;

            }
            else {
                width -= 2;
                whiteSpace++;
                height--;
                n++;
            }
        }

    }

    //Diamond with Name
    //Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
    public void diamondWithName(int n){
        int height = n + n - 1;
        int width = 1;
        int whiteSpace = n - 1;
        boolean goingUp = true;
        while (height > 0) {

            if (n == 1) {
                System.out.print("Qwill");
                goingUp = false;
            } else {
                int w = width;
                int s = whiteSpace;
                while (s > 0) {
                    System.out.print(" ");
                    s--;
                }
                while (w > 0) {
                    System.out.print("*");
                    w--;
                }
            }
            if (goingUp == true) {
                width += 2;
                whiteSpace--;
                height--;
                n--;

            } else {
                width -= 2;
                whiteSpace++;
                height--;
                n++;
            }
            System.out.println();
        }
    }

    /*
     *FizzBuzz Exercise
     *
     *FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.
     *
     *Create a FizzBuzz() method that prints out the numbers 1 through 100.
     *Instead of numbers divisible by three print "Fizz".
     *Instead of numbers divisible by five print "Buzz".
     *Instead of numbers divisible by three and five print "FizzBuzz".
     */
    public void fizzBuzz(){
        int i = 0;
        while (i<=100) {
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
            i++;
        }

    }


    public static void main(String[] args) {
        IntroProgrammingExercises exercises = new IntroProgrammingExercises();
        exercises.easiestExerciseEver();
        exercises.drawAHorizontalLine(8);
        exercises.drawAVerticalLine(3);
        exercises.drawARightTriangle(3);

        System.out.println(" ");
        exercises.isoscelesTriangle(3);
        exercises.diamond(6);
        exercises.diamondWithName(3);

        exercises.fizzBuzz();

    }
}
