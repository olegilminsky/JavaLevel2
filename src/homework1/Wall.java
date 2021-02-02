package homework1;

public class Wall implements Barrier {
    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean overcoming(Participants participant) {
        participant.jump();
        return participant.getMaxHeightJump() <= height;
    }

    public String getName() {
        return name;
    }
}
