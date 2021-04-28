package GeekBrains;

import GeekBrains.Lesson1.*;

public class MainApp {
    public static void main(String[] args) {
        RunJump[] party = {
                new Robot("Bob", 1, 1),
                new Robot("Dob", 2, 3),
                new Cat("Bars", 4, 2),
                new Cat("Mars", 3, 1),
                new Human("Jack", 1, 3),
                new Human("Nick", 2, 2)};
        Obstacles[] obstacles = {
                new RunTrack(1),
                new RunTrack(2),
                new RunTrack(3),
                new RunTrack(4),
                new Wall(1),
                new Wall(2),
                new Wall(3),
                new Wall(4)};

        for (RunJump member : party) {
            boolean win=true;
            System.out.println("Участник " + member.toString() + " приступил к выполнению препятствия");
            for (Obstacles obs : obstacles) {
                if (obs.toRun(member.getMaxLength()) || obs.toJump(member.getMaxHeight())) {
                    System.out.println("Это он сумел");
                } else {
                    win=false;
                    System.out.println("Увы, не сумел");
                    break;
                }
            }

            if (win) {
                System.out.println(member.toString() + " дошел до конца!");
            } else {
                System.out.println(member.toString() + " не дошел до конца!");
            }
            System.out.println();

        }

    }


}
