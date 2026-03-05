import java.util.Date;

public class Voucher {

    private String code;
    private double discountAmount;
    private Date expiryDate;
    private boolean isUsed;

    public boolean validate() { return false; }
    public void redeem() {}
}
