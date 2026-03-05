import java.util.Date;

public class Payment {

    private int id;
    private double amount;
    private String method;
    private String status;
    private String transactionId;
    private Date paidAt;

    public boolean process() { return false; }
    public boolean refund() { return false; }
}
