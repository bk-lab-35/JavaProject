package assignmentThreeNew;

public enum PassengerType {
    CHILD(0.5),
    SENIOR(0.3),
    ADULT(0);
    
    private final double discount;
    
    PassengerType(double discount) {
        this.discount = discount;
    }
    
    public double getDiscount() {
        return discount;
    }
}