package subscription;

public class FreemiumSub extends BaseSubscription {

    private int allowedExtraDays;

    public FreemiumSub(SubEnum numberOfDays, int allowed) {
        super(numberOfDays);
        this.allowedExtraDays = allowed;
    }
    
}
