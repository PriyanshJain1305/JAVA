public class Main  {
    public void fullThrottle() {
        System.out.println("the car is going as fast is can !");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is : " + maxSpeed);
    }
    public static void main(String[] args) {
        Main myCar = new Main();
         myCar.fullThrottle();
        myCar.speed(200);
    }
}
 