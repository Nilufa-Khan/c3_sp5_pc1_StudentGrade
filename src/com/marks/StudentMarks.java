package com.marks;

public class StudentMarks {
    public int calculateMarks(int math,int physics,int chemistry, int biology){
        return math + physics + chemistry + biology;

    }
    public int calculateMarks(int math, int physics, int chemistry){
        return  math + physics + chemistry;
    }
    public int calculateMarks(float math, float physics,float chemistry){
        float res = math + physics + chemistry;
        return  (int)res;
    }
}
