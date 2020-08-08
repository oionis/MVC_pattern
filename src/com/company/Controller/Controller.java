package com.company.Controller;

import com.company.Model.DBLayer;
import com.company.Model.ModelLayer;
import com.company.Student;
import com.company.View.ConsoleView;
import com.company.View.View;

public class Controller {
    private ModelLayer modelLayer = new DBLayer();
    private View view = new ConsoleView();
    public void execute(){
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}
