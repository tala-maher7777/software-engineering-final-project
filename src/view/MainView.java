package View;

public class MainView {

    public void showWelcome() {
        System.out.println("Welcome to Educational Content Management System");
    }

    public void showStudentProgress(String studentName, double progress) {
        System.out.println("Student: " + studentName);
        System.out.println("Progress: " + progress + "%");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}