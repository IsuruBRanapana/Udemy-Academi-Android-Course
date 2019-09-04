package com.more.classes;

public class Driver {
    public static void main(String[] args) {
        Subject subject1=new Subject("IS22221","Java Programming");
        Student student1=new Student("ABCd",12345);
        ExamPaper paper=new ExamPaper(student1,subject1,100);
        System.out.println(paper);

        System.out.println("only subject code : "+paper.getSubject().getSubjectCode());
        System.out.println("only student number :"+paper.getStudent().getStudentNumber());
    }
}
