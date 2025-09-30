public class Dolphin extends Animal implements Swim {
   private String color;
   private double swimmingSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public Dolphin() {
        super("Dolphin");
        this.swimmingSpeed = 0.0;
        this.color = "white";
    }
    public Dolphin( String nameOfAnimal, String colorOfDolphin, double swimmingSpeed){
        super(nameOfAnimal);
        this.color = colorOfDolphin;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin:I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");

    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimmimg at the speed of 70 nautical miles per hour");
    }
}
