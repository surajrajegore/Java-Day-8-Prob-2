package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

    Line l1 = new Line();
    double length1 = l1.getInputForLine1();
    double length2 = l1.getInputForLine2();
        Line.checkEquality(length1,length2);



    }
}
class Line
{
    Scanner sc = new Scanner(System.in);
    public double getInputForLine1() {
        System.out.println("Enter Inputs of line 1");
        System.out.println("Enter the first (x1,y1) point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second (x2, y2) point");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
       return calculateLength(x,y);


    }
    public double getInputForLine2() {

        System.out.println("Enter Inputs of line 2");
        System.out.println("Enter the first (x1,y1) point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second (x2, y2) point");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        return calculateLength(x,y);

    }
    public  double calculateLength(double x , double y){
        double length = (Math.sqrt(x + y));
        System.out.println("Length of a line : "+length);
        return length;
    }
    public static void checkEquality(double length1,double length2) {

                if (length1 == length2) {
                    System.out.println("lines are equal ");
                }
                else{
                    System.out.println("Lines2 are not equal");
                }
    }


}


