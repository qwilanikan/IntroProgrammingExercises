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


    public static void main(String[] args) {
        IntroProgrammingExercises exercises = new IntroProgrammingExercises();
        exercises.easiestExerciseEver();
        exercises.drawAHorizontalLine(8);
        exercises.drawAVerticalLine(3);
        exercises.drawARightTriangle(3);
    }
}
