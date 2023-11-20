package subscription;

public enum SubEnum {
    SEVEN(7), FIFTEEN(15), TWENTY_EIGHT(28);
    
    private final int value;
    
    SubEnum(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}