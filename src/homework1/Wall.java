package homework1;

public class Wall implements Barrier {
    private String name;
    private float height;

    public Wall(String name, float height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean overcoming(Participants participant) {
        participant.jump();
        return participant.getMaxHeightJump() >= height;
    }

    public String getNameAndParameters() {
        return name + " высотой " + String.format("%.2f", height) + " метров.";
    }
}
