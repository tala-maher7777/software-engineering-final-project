
package Model;

public class Student {

    private int studentId;
    private String name;
    private String email;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public void viewContent() {
        System.out.println(name + " is viewing content.");
    }

    public void trackProgress() {
        System.out.println(name + " is tracking progress.");
    }

    public String getName() {
        return name;
    }
}