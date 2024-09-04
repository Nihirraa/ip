public class deadlineTask extends Task {
    private String dl;

    deadlineTask(String status, String dl) {
        super(status);
        this.dl = dl;
    }

    @Override
    public String toString() {
        String icon = "[D]";
        return icon + super.toString() + " (by: " + dl + ")";
    }
}
