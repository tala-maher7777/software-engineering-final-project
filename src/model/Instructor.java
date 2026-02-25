package Model;

public class Instructor {

    private int instructorId;
    private String name;

    public Instructor(int instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
    }

    public void uploadContent() {
        System.out.println(name + " uploaded new content.");
    }

    public String getName() {
        return name;
    }
}