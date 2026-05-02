package assignmentThreeNew;

public enum SeatClass {
    ECONOMY(500),
    BUSINESS(1200);
    
    private final double baseFare;
    
    SeatClass(double baseFare) {
        this.baseFare = baseFare;
    }
    
    public double getBaseFare() {
        return baseFare;
    }

}