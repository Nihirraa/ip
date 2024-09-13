import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeadlineTask extends Task {
    private Date dl;
    private static final SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static final SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

    public DeadlineTask(String description, String by) throws ParseException {
        super(description);
        this.dl = inputFormat.parse(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + outputFormat.format(dl) + ")";
    }

    @Override
    public String toText() {
        return "D | " + super.toText() + " | " + inputFormat.format(dl);
    }
}