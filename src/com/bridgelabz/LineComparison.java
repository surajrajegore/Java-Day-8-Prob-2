package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first (x1,y1) point");
    int x1 = getInput("x1");
    int y1 = getInput("y1");
        System.out.println("Enter the second (x2, y2) point");
    int x2 = getInput("x2");
    int y2 = getInput("y2");
    double x = Math.pow((x2 - x1), 2);
    double y = Math.pow((y2 - y1), 2);
    calculateLength(x,y);
}
    public static int getInput(String number) {
        System.out.println("Enter the " + number + " line co-ordinates");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void calculateLength(double x , double y){
        Double length = (Math.sqrt(x + y));
        System.out.println("Length of a line : "+length);
    }
}


