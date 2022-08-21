package com.marks;

public class StudentsMarksImpl {
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
        int res1 =  obj.calculateMarks(10,20,30,40);
        System.out.println("res1 = " + res1);
        int res2 = obj.calculateMarks(10,20,30);
        System.out.println("res2 = " + res2);
        int res3 = obj.calculateMarks(10,20.5f,30.5f);
        System.out.println("res3 = " + res3);
    }
}
