package enemy;
import java.util.Random;
public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    @Override
    public void fireWepon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy TAnk Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
