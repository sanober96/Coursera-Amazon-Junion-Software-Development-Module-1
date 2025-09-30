public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private double speed;
    private double soundLevel;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }
    public Tiger(){
        super("Tiger");
        this.numberOfStripes = 0;
        this.speed = 0.0;
        this.soundLevel = 0.0;
    }
    public Tiger(String nameOfAnimal, int numberOfStripes, double speed, double soundLevelOfRoar) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: i am walking at the speed " + speed +"mph");
    }



}
