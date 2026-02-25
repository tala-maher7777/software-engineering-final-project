package controller.java;

import Model.Student;
import Model.Instructor;
import Model.Progress;
import view.java.MainView;

public class MainController {

    private MainView view;

    public MainController(MainView view) {
        this.view = view;
    }

    public void runSystem() {

        // Create objects
        Student student = new Student(1, "Ahmad", "ahmad@email.com");
        Instructor instructor = new Instructor(1, "Dr. Ali");
        Progress progress = new Progress(10, 7);

        // System operations
        view.showWelcome();

        instructor.uploadContent();
        student.viewContent();

        double progressValue = progress.calculateProgress();
        view.showStudentProgress(student.getName(), progressValue);
    }
}