package Model;

public class Content {

    private int contentId;
    private String contentTitle;
    private String type;

    public Content(int contentId, String contentTitle, String type) {
        this.contentId = contentId;
        this.contentTitle = contentTitle;
        this.type = type;
    }

    public void displayContent() {
        System.out.println("Displaying: " + contentTitle);
    }
}