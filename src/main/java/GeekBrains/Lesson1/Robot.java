package GeekBrains.Lesson1;

public class Robot implements RunJump{
    private String name;
    private int maxHeight;
    private int maxLenght;

    public Robot(String name, int maxHeight, int maxLenght) {
        this.name = name;
        this.maxHeight=maxHeight;
        this.maxLenght = maxLenght;
    }

    public String getName() {
        return name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLength() {
        return maxLenght;
    }

    @Override
    public void run() {
        System.out.println("Robot "+ name + " runnable!");
    }

    @Override
    public void jump() {
        System.out.println("Robot "+ name + " jump!");
    }

    @Override
    public String toString() {
        return ("Робот " + name+ " ");
    }
}
