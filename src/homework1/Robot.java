package homework1;

public class Robot implements Participants {
    private String name;
    private int maxDistance;
    private float maxHeightJump;

    public Robot(String name, int maxDistance, float maxHeightJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public void run() {
        System.out.println(this.name + " бежит.");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгает.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public float getMaxHeightJump() {
        return maxHeightJump;
    }
}
