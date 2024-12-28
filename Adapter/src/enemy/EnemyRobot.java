package enemy;
import java.util.Random;
//Adaptee
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands(){

        int attabkDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attabkDamage + " Damage With its hands");
    }

    public void walkForward(){
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward" + movement + " Spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
