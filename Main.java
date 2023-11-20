import subscription.FreemiumSub;
import subscription.SubEnum;
import user.Eit;

public class Main {
    public static void main(String[] args) {
        Eit eit = new Eit("John", "Doe", "Smith", "johndoe@gmail.com");
        FreemiumSub freemiumSub = new FreemiumSub(SubEnum.FIFTEEN, 2);
    }
}
