package Model;

public class Progress {

    private int totalContent;
    private int completedContent;

    public Progress(int totalContent, int completedContent) {
        this.totalContent = totalContent;
        this.completedContent = completedContent;
    }

    public double calculateProgress() {
        if (totalContent == 0) {
            return 0;
        }
        return ((double) completedContent / totalContent) * 100;
    }
}