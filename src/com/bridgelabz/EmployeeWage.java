package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
//         double x = Math.random();
//        System.out.println(x);
//        double y = Math.floor(x*10);
//        System.out.println(y);
//        int z = (int)y%2;
//        System.out.println(z);

        int empCheck = (int)Math.floor(Math.random()*10)%2;
        if(empCheck == 1)
            System.out.println("Employee Present");
        else
            System.out.println("Employee Absent");

    }
}
