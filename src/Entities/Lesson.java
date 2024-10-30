package Entities;

public abstract class Lesson {
    private String title;

    public Lesson(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lesson(String title) {
        this.title = title;
    }
    public abstract double duration();

}
