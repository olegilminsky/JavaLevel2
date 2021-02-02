package homework1;

import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        Random random = new Random();

        Participants participants[] = {new Human("Аркадий", 2000, 2),
                new Human("Алина", 1500, 3.5f),
                new Robot("R2D2", 1000, 1f),
                new Robot("Wall-E", 5000, 0),
                new Cat("Барсик", 500, 1.5f),
                new Cat("Мурка", 400, 1.3f)
        };

        Barrier barriers[] = new Barrier[10];
        for (int i = 0; i < 10; i += 2) {
            barriers[i] = new RunningTrack("Беговая дорожка № " + i, random.nextInt(3000));
            barriers[i++] = new Wall("Стена № " + i + 1, random.nextInt(5));
        }

        for (Participants participant : participants) {
            for (Barrier barrier : barriers) {
                barrier.overcoming(participant);
            }
        }

    }
}
