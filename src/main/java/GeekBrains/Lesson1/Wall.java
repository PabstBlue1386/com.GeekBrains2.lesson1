package GeekBrains.Lesson1;

public class Wall implements Obstacles {
    int height;

    public Wall(int height) {
        this.height = height;

    }

    @Override
    public boolean toRun(int length) {
        return false;
    }

    @Override
    public boolean toJump(int height){
    return (this.height >=height);

    }



}
