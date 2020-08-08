package com.company.View;

import com.company.Student;

public class HTMLView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("<html><body> Student name: " + student.getName() + " Student age: " + student.getAge() + "</body></html>");
    }
}
