public class Buyer extends User {

    private String deliveryAddress;
    private int loyaltyPoints;

    public Order placeOrder() { return null; }
    public boolean applyVoucher(String code) { return false; }
    public Review writeReview() { return null; }
    public String trackOrder(int id) { return null; }
}
