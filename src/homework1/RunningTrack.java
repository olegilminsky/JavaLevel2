package homework1;

public class RunningTrack implements Barrier {
    private String name;
    private int length;

    public RunningTrack(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean overcoming(Participants participant) {
        participant.run();
        return participant.getMaxDistance() >= length;
    }

    public String getNameAndParameters() {
        return name + " длиной " + length + " метров.";
    }
}
