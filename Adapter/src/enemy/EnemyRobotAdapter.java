package enemy;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot = newRobot;
    }

    @Override
    public void fireWepon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
