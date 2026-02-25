package Model;

public class Course {

    private int courseId;
    private String title;

    public Course(int courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}