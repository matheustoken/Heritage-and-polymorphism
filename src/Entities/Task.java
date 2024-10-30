package Entities;

public class Task extends Lesson {
    private String description;
    private Integer questionCount;

    public Task (){
        super();
    }

    public Task(String title, String description, Integer questionCount) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    @Override
    public double duration(){
        return questionCount*5*60;
    }

}