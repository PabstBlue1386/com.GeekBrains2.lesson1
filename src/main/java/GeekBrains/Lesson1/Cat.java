package GeekBrains.Lesson1;

public class Cat implements RunJump {
    private String name;
    private int maxHeight;
    private int maxLength;

    public Cat(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public String getName() {
        return name;
    }


    @Override
    public void run() {
        System.out.println("Кот бегает");

    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;

    }
    @Override
    public String toString() {
        return ("Кот " + name+ " ");
    }
}
