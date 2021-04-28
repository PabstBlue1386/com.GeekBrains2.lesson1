package GeekBrains.Lesson1;

public class Human implements RunJump {
    private String name;
    private int maxLength;
    private  int maxHeight;

    public Human(String name, int maxHeight, int maxLength){
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }


    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void run(){
        System.out.println("Human "+ name  + " runnable!");
    }

    @Override
    public void jump() {
        System.out.println("Human "+ name + " jump!");
    }

    @Override
    public String toString() {
        return ("Человек " + name+ " ");
    }
}
