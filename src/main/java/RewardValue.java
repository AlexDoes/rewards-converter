public class RewardValue {
    private final double cashValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = valueToCash(milesValue);
    }

    public static final double RATE = 0.0035;

    public double getCashValue() {
        return cashValue;
    }

    private static int valueToMiles(double cashValue) {
        return (int) (cashValue / RATE);
    }

    public int getMilesValue() {
        return valueToMiles(this.cashValue);
    }

    private static double valueToCash(int milesValue) {
        return milesValue * RATE;
    }
}
