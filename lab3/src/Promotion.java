import java.util.Date;

public class Promotion {

    private int id;
    private double discountPct;
    private Date startDate;
    private Date endDate;
    private boolean isActive;

    public void activate() {}
    public void deactivate() {}
    public double apply(double price) { return 0; }
}
