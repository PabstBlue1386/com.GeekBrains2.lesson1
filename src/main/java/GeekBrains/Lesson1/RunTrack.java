package GeekBrains.Lesson1;

public class RunTrack implements Obstacles {
    int length;

    public RunTrack(int length){
        this.length = length;
    }

    @Override
    public boolean toRun(int length) {
        return (this.length>=length);
    }

    @Override
    public boolean toJump(int height) {
        return false;
    }
}
