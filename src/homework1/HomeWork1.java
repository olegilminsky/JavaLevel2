package homework1;

import java.util.Random;

public class HomeWork1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Random random = new Random();

        Participants[] participants = {new Human("Аркадий", 2000, 2f),
                new Human("Алина", 1500, 3.5f),
                new Robot("R2D2", 1000, 1f),
                new Robot("Wall-E", 5000, 0f),
                new Cat("Барсик", 500, 1.5f),
                new Cat("Мурка", 400, 1.3f)
        };

        Barrier[] barriers = new Barrier[10];
        for (int i = 0, j = 1; i < 10; i++) {
            barriers[i] = new RunningTrack("Беговая дорожка № " + j, random.nextInt(1500));
            barriers[i += 1] = new Wall("Стена № " + j, random.nextFloat());
            j++;
        }

        for (Participants participant : participants) {
            System.out.println("Участник " + participant.getName() + " на старте!");
            for (Barrier barrier : barriers) {
                if (participant.getAtDistance()) {
                    System.out.println(ANSI_BLUE + "Препятствие " + barrier.getNameAndParameters() + ANSI_RESET);
                    if (barrier.overcoming(participant)) {
                        System.out.println(ANSI_YELLOW + participant.getName() + " преодолел препятствие!" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_RED + "Участник " + participant.getName() + " не смог преодолеть препятствие и сошел с дистанции!" + ANSI_RESET);
                        participant.setAtDistance(false);
                        break;
                    }
                }
            }
            if (participant.getAtDistance()) {
                System.out.println(ANSI_GREEN + "Участник " + participant.getName() + " финишировал!" + ANSI_RESET);
            }
        }
    }
}

