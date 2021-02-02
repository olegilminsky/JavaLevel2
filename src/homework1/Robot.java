package homework1;

public class Robot implements Participants {
    private String name;
    private int maxDistance;
    private float maxHeightJump;
    private boolean atDistance;

    public Robot(String name, int maxDistance, float maxHeightJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeightJump = maxHeightJump;
        atDistance = true;
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

    @Override
    public boolean getAtDistance() {
        return atDistance;
    }

    @Override
    public void setAtDistance(boolean atDistance) {
        this.atDistance = atDistance;
    }
}
