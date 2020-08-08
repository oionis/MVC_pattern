package com.company.View;

import com.company.Student;

public class ConsoleView implements View{
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " Age: " + student.getAge());
    }
}
