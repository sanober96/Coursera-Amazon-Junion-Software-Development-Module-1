public class Penguin extends Animal implements Walk, Swim {
   private boolean isSwimming;
   private double walkSpeed;
   private double swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Penguin(){
        super("penguin");
        this.isSwimming = true;
        this.swimSpeed = 0.0;
        this.walkSpeed = 0.0;
    }
    public Penguin(String nameOfAnimal, boolean isSwimming, double swimSpeed, double walkSpeed){
        super(nameOfAnimal);
        this.isSwimming = isSwimming;
        this.swimSpeed = swimSpeed;
        this.walkSpeed = walkSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void walking() {
        System.out.println("Dolphin : i am walking at the speed " + walkSpeed +" mph");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin : I am swimmimg at the speed of " + swimSpeed + " miles per hour");

    }
}
