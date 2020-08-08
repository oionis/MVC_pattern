package com.company.Model;

import com.company.Student;

public class FileSystemLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        return new Student();
    }
}